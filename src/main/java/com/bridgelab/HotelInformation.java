package com.bridgelab;

public class HotelInformation {

        private String hotelName;
        private int rate;


        //getter and setter
        public String getHotelName() {
            return hotelName;
        }

        public int getRate(){
             return rate;
         }

        public void setHotelName(String hotelName) {
            this.hotelName = hotelName;
        }

        public void setRate(int rate) {
            this.rate = rate;
        }


        @Override
        public String toString() {
            return "\n"+"Hotel{" +
                    "hotelName='" + hotelName + '\'' +
                    ", Rating=" +rate +'\''+
                    '}';
        }

        public HotelInformation(String hotelName, int rate) {
            this.hotelName = hotelName;
            this.rate = rate;
        }
    }
