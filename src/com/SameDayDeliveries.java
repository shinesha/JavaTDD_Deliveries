package com;

public class SameDayDeliveries {
    public double Same_Day_Documents;
    public double Same_Day_Small_Parcel;
    public double Same_Day_Large_Parcel;
    public String Destination;
    public boolean isPremium;

    public SameDayDeliveries(double same_Day_Documents, double same_Day_Small_Parcel, double same_Day_Large_Parcel, String destination, boolean isPremium) {
        Same_Day_Documents = same_Day_Documents;
        Same_Day_Small_Parcel = same_Day_Small_Parcel;
        Same_Day_Large_Parcel = same_Day_Large_Parcel;
        Destination = destination;
        this.isPremium = isPremium;
    }

    public SameDayDeliveries() {

    }

    public double getSame_Day_Documents() {
        return Same_Day_Documents;
    }

    public void setSame_Day_Documents(double same_Day_Documents) {
        Same_Day_Documents = same_Day_Documents;
    }

    public double getSame_Day_Small_Parcel() {
        return Same_Day_Small_Parcel;
    }

    public void setSame_Day_Small_Parcel(double same_Day_Small_Parcel) {
        Same_Day_Small_Parcel = same_Day_Small_Parcel;
    }

    public double getSame_Day_Large_Parcel() {
        return Same_Day_Large_Parcel;
    }

    public void setSame_Day_Large_Parcel(double same_Day_Large_Parcel) {
        Same_Day_Large_Parcel = same_Day_Large_Parcel;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}

