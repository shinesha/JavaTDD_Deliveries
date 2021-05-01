package com;

public class Rates {
    //Highlands and Islands check
    public static SameDayDeliveries valid_Destination(SameDayDeliveries delivery) {
        if (delivery.Destination == "Highlands" || delivery.Destination == "Islands") {
            System.out.println("invalid destination");
        } else {
            return delivery;
        }
        return delivery;
    }

    public double getPrice(SameDayDeliveries delivery, TwoDayDeliveries two_delivery) {
        //Islands and Highlands check
        delivery = Rates.valid_Destination(delivery);

        double same_day_documents = delivery.getSame_Day_Documents() * 4.00;
        double same_day_small_parcel = delivery.getSame_Day_Small_Parcel() * 7.00;
        double same_day_large_parcel = delivery.getSame_Day_Large_Parcel() * 9.00;

        //same day discount
        double same_day_total = same_day_documents + same_day_small_parcel + same_day_large_parcel;

        if (delivery.getSame_Day_Documents() + delivery.getSame_Day_Small_Parcel() + delivery.getSame_Day_Large_Parcel() == 3) {
            same_day_total= same_day_total- ((same_day_total/100) *5);
        }

        double two_day_documents = two_delivery.getTwo_Day_Documents() * 1.00;
        double two_day_small_parcel = two_delivery.getTwo_Day_Small_Parcel() * 2.50;
        double two_day_large_parcel = two_delivery.getTwo_Day_Large_Parcel() * 3.00;

        double two_day_total = two_day_documents+ two_day_small_parcel+two_day_large_parcel;

        //premium discount but it is not available to large parcel
        double interimTotal = same_day_total +two_day_total - same_day_large_parcel - two_day_large_parcel;


        if(delivery.isPremium() || two_delivery.isPremium){
            interimTotal = interimTotal-((interimTotal/100) * 7.5);
        }
        //add back the large parcel costs that don't get the premium discount
        interimTotal = interimTotal + same_day_large_parcel +two_day_large_parcel;
        return interimTotal;


    }
}
