package com.bridgelab;

import java.util.ArrayList;

/**
 * The UHotelReservationSystem implements an application that help customer to find cheapest hotel
 * @author Antara
 * @since 2021-11-18
 */
public class HotelReservation {
    ArrayList<HotelInformation> hotelDetails=new ArrayList<>();

   //This method will add hotel name and rates

    public void  addHotel(String hotelName, int weekDayrate,int weekEndRate) {
        HotelInformation hotelInformation= new HotelInformation(hotelName, weekDayrate,weekEndRate);
        hotelDetails.add(hotelInformation);
    }

    //This method will display the list
    public void displayHotel(){
        System.out.println(hotelDetails);
    }

    // Here we check whether the hotel is been added or not
    public boolean checkHotelAdd(HotelInformation hotel) {
        return hotelDetails.add(hotel);
    }

    /*
     *creating object of HotelReservation
     * adding hotel details
     * displaying list
     */
    public static void main(String[] args) {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("LakeWood",110,90);
        hotelReservation.addHotel("BridgeWood",160,60);
        hotelReservation.addHotel("RidgeWood", 220,150);
        hotelReservation.displayHotel();
    }
}