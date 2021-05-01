package Test;

import com.SameDayDeliveries;
import com.Rates;
import com.TwoDayDeliveries;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.assertEquals;

public class DeliveryTesting {
    Rates deliveryRates = new Rates();
    SameDayDeliveries SDelivery = new SameDayDeliveries();
    SameDayDeliveries SDelivery2 = new SameDayDeliveries();
    SameDayDeliveries SDelivery3 = new SameDayDeliveries();
    SameDayDeliveries SDelivery4 = new SameDayDeliveries();

    TwoDayDeliveries TDelivery2 = new TwoDayDeliveries();
    TwoDayDeliveries TDelivery3 = new TwoDayDeliveries();
    TwoDayDeliveries TDelivery4 = new TwoDayDeliveries();
    TwoDayDeliveries TDelivery7 = new TwoDayDeliveries();
    TwoDayDeliveries TDelivery8 = new TwoDayDeliveries();
    TwoDayDeliveries TDelivery9 = new TwoDayDeliveries();

    @Test
    public void One_Product_And_One_Day_Delivery() {
        SDelivery.setSame_Day_Documents(1);
        SDelivery2.setSame_Day_Small_Parcel(1);
        SDelivery3.setSame_Day_Large_Parcel(1);

        assertEquals(4.00, deliveryRates.getPrice(SDelivery, TDelivery7), 0.00);
        assertEquals(7.00, deliveryRates.getPrice(SDelivery2, TDelivery8), 0.00);
        assertEquals(9.00, deliveryRates.getPrice(SDelivery3, TDelivery9), 0.00);

    }

// test fails after we apply 5% discount later
//    @Test
//    public void Three_Products_And_One_Day() {
//        SDelivery4.setSame_Day_Documents(1);
//        SDelivery4.setSame_Day_Small_Parcel(1);
//        SDelivery4.setSame_Day_Large_Parcel(1);
//
//        SDelivery3.setSame_Day_Documents(2);
//        SDelivery3.setSame_Day_Large_Parcel(1);
//
//        SDelivery2.setSame_Day_Small_Parcel(2);
//        SDelivery2.setSame_Day_Large_Parcel(1);
//
//        assertEquals(20.00, deliveryRates.getPrice(SDelivery4, TDelivery7), 0.00);
//        assertEquals(17.00, deliveryRates.getPrice(SDelivery3, TDelivery8), 0.00);
//        assertEquals(23.00, deliveryRates.getPrice(SDelivery2, TDelivery9), 0.00);
//
//    }

    @Test
    public void Three_Products_And_Two_Days() {
        TDelivery7.setTwo_Day_Documents(1);
        TDelivery7.setTwo_Day_Small_Parcel(1);
        TDelivery7.setTwo_Day_Large_Parcel(1);

        TDelivery8.setTwo_Day_Documents(2);
        TDelivery8.setTwo_Day_Large_Parcel(1);

        TDelivery9.setTwo_Day_Small_Parcel(2);
        TDelivery9.setTwo_Day_Large_Parcel(1);


        assertEquals(6.50, deliveryRates.getPrice(SDelivery, TDelivery7), 0.00);
        assertEquals(5.00, deliveryRates.getPrice(SDelivery, TDelivery8), 0.00);
        assertEquals(8.00, deliveryRates.getPrice(SDelivery, TDelivery9), 0.00);
    }

    @Test
    public void Three_Same_Day_Items_Discount() {
        SDelivery4.setSame_Day_Documents(1);
        SDelivery4.setSame_Day_Small_Parcel(1);
        SDelivery4.setSame_Day_Large_Parcel(1);

        SDelivery3.setSame_Day_Documents(2);
        SDelivery3.setSame_Day_Large_Parcel(1);

        SDelivery2.setSame_Day_Small_Parcel(2);
        SDelivery2.setSame_Day_Large_Parcel(1);

        assertEquals(19.00, deliveryRates.getPrice(SDelivery4, TDelivery7), 0.00);
        assertEquals(16.15, deliveryRates.getPrice(SDelivery3, TDelivery8), 0.00);
        assertEquals(21.85, deliveryRates.getPrice(SDelivery2, TDelivery9), 0.00);
    }

    @Test
    public void Sames_Day_Not_Availble_For_HighLands_And_Islands() {
        SDelivery4.setDestination("");
        SDelivery3.setDestination("");
        assertThat(deliveryRates.valid_Destination(SDelivery4), is(not("Highlands")));
        assertThat(deliveryRates.valid_Destination(SDelivery3), is(not("Islands")));


    }
    @Test
    public void Five_percent_premium_discount(){
        SDelivery4.setSame_Day_Documents(2);
        TDelivery4.setTwo_Day_Documents(1);
        SDelivery4.setPremium(true);
        TDelivery4.setPremium(true);

        TDelivery3.setTwo_Day_Small_Parcel(3);
        SDelivery3.setPremium(true);
        TDelivery3.setPremium(true);

        SDelivery2.setSame_Day_Large_Parcel(2);
        TDelivery2.setTwo_Day_Large_Parcel(1);
        SDelivery2.setPremium(true);
        TDelivery2.setPremium(true);

        assertEquals(8.325, deliveryRates.getPrice(SDelivery4, TDelivery4), 0.0);
        assertEquals(6.9375, deliveryRates.getPrice(SDelivery3, TDelivery3), 0.0);
        assertEquals(21.00, deliveryRates.getPrice(SDelivery2, TDelivery2), 0.0);

    }

    //incomplete
//    @Test
//    public void Different_Pick_Up_And_Destinations(){
//        SDelivery4.setOrigin("Chester");
//        TDelivery4.setOrigin("Chester");
//
//        SDelivery4.setDestination("Chester");
//        TDelivery4.setDestination("Chester");
//
//        SDelivery3.setOrigin("Chester");
//        TDelivery3.setOrgin("Chester");
//        SDelivery3.setDestination("Manchester");
//        TDelivery3.setDestination("Manchester");
//
//        assertEquals("invalid addresses", deliveryRates.getPrice(SDelivery4, TDelivery4));
//        assertEquals("valid addresses", deliveryRates.getPrice(SDelivery3, TDelivery3));


    }



