package com.company.facade;

import com.company.flights;
import com.company.hotel;

    public class facade {
        private flights ObjectFlight;
        private hotel Objecthotel;

        public facade() {
            ObjectFlight = new flights();
            Objecthotel = new hotel();
        }

        public void search(String Origin, String Destiny, String Date) {
            ObjectFlight.searchFlight(Origin, Destiny, Date);
            Objecthotel.searchHotel(Origin, Destiny, Date);
        }
    }
