package com.company.facade;

import com.company.facade.com.company.subclasses.Flights;
import com.company.facade.com.company.subclasses.Hotel;



    public class Facade {
        private Flights ObjectFlight;
        private Hotel ObjectHotel;

        public Facade() {
            ObjectFlight = new Flights();
            ObjectHotel = new Hotel();
        }

        public void result() {
            ObjectFlight.search();
            ObjectHotel.search();
        }
    }
