package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightCheck {

        public void findFlight(Flight flight) throws RouteNotFoundException {
            Map<String,Boolean> flightPort = new HashMap<>();
            if(flightPort.containsKey(flight.getArrivalAirport())){
                flightPort.get(flight.getArrivalAirport());
            }
            throw new RouteNotFoundException();
        }
}
