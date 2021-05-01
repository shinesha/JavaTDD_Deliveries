package com;

public class TwoDayDeliveries {

    public double Two_Day_Documents;
    public double Two_Day_Small_Parcel;
    public double Two_Day_Large_Parcel;
    public boolean isPremium;

    public TwoDayDeliveries(double two_Day_Documents, double two_Day_Small_Parcel, double two_Day_Large_Parcel, boolean isPremium) {
        Two_Day_Documents = two_Day_Documents;
        Two_Day_Small_Parcel = two_Day_Small_Parcel;
        Two_Day_Large_Parcel = two_Day_Large_Parcel;
        this.isPremium = isPremium;
    }

    public TwoDayDeliveries() {

    }

    public double getTwo_Day_Documents() {
        return Two_Day_Documents;
    }

    public void setTwo_Day_Documents(double two_Day_Documents) {
        Two_Day_Documents = two_Day_Documents;
    }

    public double getTwo_Day_Small_Parcel() {
        return Two_Day_Small_Parcel;
    }

    public void setTwo_Day_Small_Parcel(double two_Day_Small_Parcel) {
        Two_Day_Small_Parcel = two_Day_Small_Parcel;
    }

    public double getTwo_Day_Large_Parcel() {
        return Two_Day_Large_Parcel;
    }

    public void setTwo_Day_Large_Parcel(double two_Day_Large_Parcel) {
        Two_Day_Large_Parcel = two_Day_Large_Parcel;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}
