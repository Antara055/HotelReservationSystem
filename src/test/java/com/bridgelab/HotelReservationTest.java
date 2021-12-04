package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
    @Test
    public void ifHotelAdded_ShouldPassTest() {
        HotelReservation hotelReservation = new HotelReservation();

        boolean lakewood = hotelReservation.checkHotelAdd(new HotelInformation("LakeWoods",110,90));
        Assert.assertTrue(lakewood);
        boolean bridgewood = hotelReservation.checkHotelAdd(new HotelInformation("Bridgewood", 160,60));
        Assert.assertTrue(bridgewood);
        boolean ridgewood = hotelReservation.checkHotelAdd(new HotelInformation("Ridgewood", 220,150));
        Assert.assertTrue(ridgewood);
    }
}
