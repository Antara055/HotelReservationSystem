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

    public void  addHotel(String hotelName, int rate) {
        HotelInformation hotelInformation= new HotelInformation(hotelName, rate);
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
    public static void main(String[] args) {

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("LakeWood",5);
        hotelReservation.addHotel("BridgeWood",3);
        hotelReservation.addHotel("RidgeWood", 4);
        //calling displayHotels to display list
        hotelReservation.displayHotel();
    }
}