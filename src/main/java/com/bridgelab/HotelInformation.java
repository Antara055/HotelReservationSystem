package com.bridgelab;

public class HotelInformation {
    //variables
    private String hotelName;
    private int weekdayRate;
    private int weekendRate;

    //Parameterized Constructor
    public HotelInformation(String hotelName, int weekdayRate, int weekendRate) {
        this.hotelName = hotelName;
        this.weekdayRate = weekdayRate;
        this.weekendRate=weekendRate;
    }

    //getter and setter
        public String getHotelName() {
            return hotelName;
        }
        public void setHotelName(String hotelName) {
            this.hotelName = hotelName;
        }
        public int getWeekdayRate() {
            return weekdayRate;
        }
        public void setWeekdayRate(int weekdayRate) {
            this.weekdayRate = weekdayRate;
        }
        public int getWeekendRate() {
            return weekendRate;
        }
        public void setWeekendRate(int weekendRate) {
            this.weekendRate = weekendRate;
        }

    @Override
        public String toString() {
            return "\n"+"Hotel{" +
                    "hotelName='" + hotelName + '\'' +
                    ", weekDayRating=" +weekdayRate +'\''+
                    ", weekEndRating=" +weekendRate +'\''+
                    '}';
        }
    }
