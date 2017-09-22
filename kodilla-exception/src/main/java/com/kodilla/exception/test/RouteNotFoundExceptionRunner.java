package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warszawa","Kraków");

        FlightCheck flightCheck = new FlightCheck();
        try{
            flightCheck.findFlight(flight);
        }catch (RouteNotFoundException e){
            System.out.println("Lotnisko nie istnieje w bazie.Wpisz inne lotnisko!");
        }
    }
}
