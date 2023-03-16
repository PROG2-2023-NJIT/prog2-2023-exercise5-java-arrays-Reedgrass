package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;
import java.util.Scanner;

public class FlightBooking {  
private int childPassengers;
private int adultPassengers;
private int totalPassengers;
private LocalDate departureDate;
private LocalDate returnDate;
private double totalTicketPrice ;
public enum BookingClass {
     FIRST, BUSSINESS, ECONOMY
}
public enum TripType {
    ONE_WAY,RETURN
}
public enum TripSource {
    NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS
}
public enum TripDestination {
    NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS
}
public enum SourceAirport {
    NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT, SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT,PARIS_CHARLES_DE_GAULLE_AIRPORT
}
public enum DestinationAirport {
    NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT, SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT,PARIS_CHARLES_DE_GAULLE_AIRPORT
}
private BookingClass bookingClass;
private TripType tripType;
private TripSource tripSource;
private TripDestination tripDestination;
private SourceAirport sourceAirport;
private DestinationAirport destinationAirport;
private double departingTicketPrice;
private double returnTicketPrice;

private String[] passengerFullName ;
private String[] passengerGender ;
private int[] passengerAge ;
private String[] ticketNumber ;

public FlightBooking(int i) {
    passengerFullName = new String[i];
    passengerGender = new String[i];
    passengerAge = new int[i];
    ticketNumber = new String[i];
}
//getter

public TripSource getTripSource() {
    return tripSource;
}

public SourceAirport getSourceAirport() {
    return sourceAirport;
}

public TripDestination getTripDestination() {
    return tripDestination;
}

public DestinationAirport getDestinationAirport() {
    return destinationAirport;
}

public LocalDate getDepartureDate() {
    return departureDate;
}


public LocalDate getReturnDate() {
    return returnDate;
}

public void setBookingClass(String numOfBookingClass)
{
    switch(numOfBookingClass)
    {
        case "1" : bookingClass = BookingClass.FIRST;
                 break;
        case "2" : bookingClass = BookingClass.BUSSINESS;
                 break;
        case "3" : bookingClass = BookingClass.ECONOMY;
                 break;
    }
}

public void setChildPassengers(int childPassengers) {
    this.childPassengers = childPassengers;
    
}

public void setAdultPassengers(int adultPassengers) {
    this.adultPassengers = adultPassengers;
    
}

public int getChildPassengers() {
    return childPassengers;
}

public int getAdultPassengers() {
    return adultPassengers;
}

public void setTotalPassengers(int childPassengers,int adultPassengers){
    this.totalPassengers = childPassengers + adultPassengers;
}

public int getTotalPassengers() {
    totalPassengers = childPassengers + adultPassengers;
    return totalPassengers;
}

public void setTripType(String numOfTripType){
    switch(numOfTripType){
        case "1" :tripType = TripType.ONE_WAY;              
                break;
        case "2" :tripType = TripType.RETURN;                
                break;
    }
}
public void setTripSource(String numOfTripSource){
    switch(numOfTripSource){
        case "1" :tripSource = TripSource.NANJING;
                sourceAirport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
        case "2" :tripSource = TripSource.BEIJING;
                sourceAirport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
        case "3" :tripSource = TripSource.OULU;
                sourceAirport = SourceAirport.OULU_AIRPORT;
                break;
        case "4" :tripSource = TripSource.HELSINKI;
                sourceAirport = SourceAirport.HELSINKI_AIRPORT;
                break;
    }
}

public void setSourceAirport(String numOfTripSource){
    switch(numOfTripSource){
        case "1" :tripSource = TripSource.NANJING;
                sourceAirport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
        case "2" :tripSource = TripSource.BEIJING;
                sourceAirport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
        case "3" :tripSource = TripSource.OULU;
                sourceAirport = SourceAirport.OULU_AIRPORT;
                break;
        case "4" :tripSource = TripSource.HELSINKI;
                sourceAirport = SourceAirport.HELSINKI_AIRPORT;
                break;
    }
}
public void setTripDestination(String numOfTripSource ,String numOfTripDestination){
    switch(numOfTripDestination){
        case "1" :tripDestination = TripDestination.NANJING;
                destinationAirport = DestinationAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
        case "2" :tripDestination = TripDestination.BEIJING;
                destinationAirport = DestinationAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
        case "3" :tripDestination = TripDestination.OULU;
                destinationAirport = DestinationAirport.OULU_AIRPORT;
                break;
        case "4" :tripDestination = TripDestination.HELSINKI;
                destinationAirport = DestinationAirport.HELSINKI_AIRPORT;
                break;
    }
}

public void setDestinationAirport(String numOfTripSource ,String numOfTripDestination){
    switch(numOfTripDestination){
        case "1" :tripDestination = TripDestination.NANJING;
                destinationAirport = DestinationAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
        case "2" :tripDestination = TripDestination.BEIJING;
                destinationAirport = DestinationAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
        case "3" :tripDestination = TripDestination.OULU;
                destinationAirport = DestinationAirport.OULU_AIRPORT;
                break;
        case "4" :tripDestination = TripDestination.HELSINKI;
                destinationAirport = DestinationAirport.HELSINKI_AIRPORT;
                break;
    }
}
public void setDepartureDate(LocalDate departureDate) {
   this.departureDate = departureDate ;
}
public void setReturnDate(LocalDate returnDate){
    LocalDate expect = departureDate.plusDays(2);
    if(returnDate.isBefore(expect)){
        this.returnDate = expect;   
    }
    else {this.returnDate = returnDate;
    }
}

public void setDepartingTicketPrice(int a,int b){
    departingTicketPrice = (300 + 0.15*300 +0.1*300+ 250)*(0 + 3)  ;
}

public void setReturnTicketPrice(){
    returnTicketPrice = departingTicketPrice;
}

public void setTotalTicketPrice(){
    totalTicketPrice = returnTicketPrice + departingTicketPrice;
}


public double getTotalTicketPrice(){
     
    return totalTicketPrice;
}

public String getPassengerFullName(int i) {
    return passengerFullName[i];
}

public void setPassengerFullName(int i,String passengerFullName) {
    this.passengerFullName[i] = passengerFullName;
}

public String getPassengerGender(int i) {
    return passengerGender[i];
}

public void setPassengerGender(int i,String passengerGender) {
    this.passengerGender[i] = passengerGender;
}

public int getPassengerAge(int i) {
    return passengerAge[i];
}

public void setPassengerAge(int i,int passengerAge) {
    this.passengerAge[i] = passengerAge;
}

public String getTicketNumber(int i) {
    return ticketNumber[i];
}

public void setTicketNumber(int i) {
    this.ticketNumber[i] = "22" + "F" + "ASDF" + "INT";
}

Scanner input = new Scanner(System.in);


}
