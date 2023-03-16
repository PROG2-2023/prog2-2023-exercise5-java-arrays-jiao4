package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;
ipackage prog2.exercise6.flight.booking.system;
import java.nio.file.SimpleFileVisitor;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.Destination;
import javax.sound.sampled.SourceDataLine;
public class FlightBooking {
    private String flightCompany;
    private String flightID;
  
   
    private int childrenPassengers;
    private int adultPassengers;
  
    public void setFlightCompany(String flightCompany) {
      this.flightCompany = flightCompany;
    }
    public String getFlightCompany() {
      return flightCompany;
    }
  
  
    public void setFlightID(String flightID) {
      this.flightID = flightID;
    }
    public String getFlightID() {
      return flightID;
    }
  
  
   
  
  
    public void setChildPassengers(int childPassengers) {
      this.childrenPassengers = childPassengers;
    }
    public int getChildrenPassengers() {
      return childrenPassengers;
    }
  
  
    public void setAdultPassengers(int adultPassengers) {
      this.adultPassengers = adultPassengers;
    }
    public int getAdultPassengers() {
      return adultPassengers;
    }
  
  
    public void setTotalPassengers(int totalPassengers1,int totalPassengers2) {
      this.totalPassengers = childrenPassengers+adultPassengers;
    }
    public int getTotalPassengers() {
      return totalPassengers;
    }
  
  
   
  
    
 
    public String toString(){
     return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
     flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
     "Ticket Number: " + ticketNumber + "\n" + 
     "From " + tripSource + " to " + tripDestination + "\n" +
     "Date of departure: " + departureDate + "\n" +
     "Date of return: " + returnDate + "\n" +
     "Total passengers: " + totalPassengers + "\n" +
     "Total ticket price in Euros: " + totalTicketPrice;
   
 }
 
 
 
 
 
 
 
 //task 2
 private BookingClass bookingClass;
 public enum BookingClass{
   FIRST,BUSINESS,ECONOMY;
 }
 public void setBookingClass(String bookingClass){
   switch(bookingClass){
     case "1":
     this.bookingClass=BookingClass.FIRST;
     break;
     case "2":
     this.bookingClass=BookingClass.BUSINESS;
     break;
     case"3":
     this.bookingClass=BookingClass.ECONOMY;
     break;
     default:
     System.out.println("Invaild choice");
     break;
    }
   }
 
  public BookingClass getBookingClass(){
   return this.bookingClass;
  }
 
 
  
  
  //task3
  private TripType tripType;
  public enum TripType{
   ONE_WAY,RETURN;
  }
  public void setTripType(String tripType){
 switch(tripType){
 case "1":
 this.tripType=TripType.ONE_WAY;
 break;
 case "2":
 this.tripType=TripType.RETURN;
 break;
 default:
 System.out.println("Invaild choice");
 }
   }
  
  public TripType tripType(){
   return this.tripType;
  }
 
 
 
 
 //task 4 5
 public enum TripSource{
   NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS;
 }
 public enum TripDestination{
  NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS;
 }
 public enum Airport{
   NANJING_LUKOU_AIRPORT,BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT,OULU_AIRPORT,HELSINKI_AIRPORT,PARIS_CHARLES_DE_GAULLE_FIRPORT;
 }
 private TripSource tripSource;
 public TripDestination tripDestination;
 public Airport sourceAirport;
 public Airport destinationAirport;
 public void setTripSource(String tripSource){
   switch(tripSource){
     case "1":
     this.tripSource=TripSource.NANJING;
     this.sourceAirport=Airport.NANJING_LUKOU_AIRPORT;
     break;
     case "2":
     this.tripSource=TripSource.BEIJING;
     this.sourceAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
     break;
     case "3":
     this.tripSource=TripSource.SHANGHAI;
     this.sourceAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
     break;
     case "4":
     this.tripSource=TripSource.OULU;
     this.sourceAirport=Airport.OULU_AIRPORT;
     break;
     case "5":
     this.tripSource=TripSource.HELSINKI;
     this.sourceAirport=Airport.HELSINKI_AIRPORT;
     break;
     case "6":
     this.tripSource=TripSource.PARIS;
     this.sourceAirport=Airport.PARIS_CHARLES_DE_GAULLE_FIRPORT;
     break;
     default:
     System.out.println("Invaild choice");
     break;
   }
 }
 public TripSource getTripSource(){
   return this.tripSource;
 }
 
 
 
 public void setTripDestination(String tripSource , String tripdestination){
   
   switch(tripdestination){
     case "1":
     this.tripDestination=TripDestination.NANJING;
     this.destinationAirport=Airport.NANJING_LUKOU_AIRPORT;
     break;
     case "2":
     this.tripDestination=TripDestination.BEIJING;
     this.destinationAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
     break;
     case "3":
     this.tripDestination=TripDestination.SHANGHAI;
     this.destinationAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
     break;
     case "4":
     this.tripDestination=TripDestination.OULU;
     this.destinationAirport=Airport.OULU_AIRPORT;
     break;
     case "5":
     this.tripDestination=TripDestination.HELSINKI;
     this.destinationAirport=Airport.HELSINKI_AIRPORT;
     break;
     case "6":
     this.tripDestination=TripDestination.PARIS;
     this.destinationAirport=Airport.PARIS_CHARLES_DE_GAULLE_FIRPORT;
     break;
     default:
     System.out.println("Invaild choice");
     break;
       }
 }
 public TripDestination getTripDestination(){
   return tripDestination;
 }
 
 

 
 
 
 //task 6
 public LocalDate departureDate;
 public LocalDate returnDate;
 public void setDepartureDate(LocalDate departureDate){
   String sdepart ="2023-03-04";
   this.departureDate=LocalDate.parse(sdepart);
 }
 public LocalDate getDepartureDate(){
   return departureDate;
 }
 
 public void setReturnDate(LocalDate returnDate){
   String sreturn="2023-03-05";
   this.returnDate=departureDate.plusDays(2);
   //Period period=Period.between(returnDate,departureDate);
   long i = departureDate.toEpochDay() - returnDate.toEpochDay();
   if(i>=0 && i<1){
     LocalDate returnDate2=departureDate.plusDays(2);
   }else if(i>=1 && i<2){
     LocalDate returnDate2=departureDate.plusDays(1);
   }
 }
 public LocalDate getReturnDate(){
   return returnDate;
 }
 
 
 //task 7
 
 Random random=new Random();
 public String [] ticketNumber;
 public void setTicketNumber(int index){
    String ticketNumber=null;
   switch(tripType){
     case ONE_WAY:
     ticketNumber="11";
     break;
     case RETURN:
     ticketNumber="22";
     break;
   }
   switch(bookingClass){
     case FIRST:
     ticketNumber=ticketNumber+"F";
     break;
     case BUSINESS:
     ticketNumber=ticketNumber+"B";
     break;
     case ECONOMY:
     ticketNumber=ticketNumber+"E";
     break;
   }
  for (int i = 0; i < 4; i++) {
    char f=(char)((random.nextInt(26)+65));
          ticketNumber=ticketNumber+f;
}
    this.ticketNumber = new String[]{ticketNumber+"DOM"};
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING) {
        this.ticketNumber = new String[]{ticketNumber + "DOM"};
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
        this.ticketNumber = new String[]{ticketNumber + "DOM"};
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI) {
        this.ticketNumber = new String[]{ticketNumber + "DOM"};
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU) {
        this.ticketNumber = new String[]{ticketNumber + "DOM"};
    }
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.OULU) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.NANJING) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.HELSINKI) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.NANJING) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.OULU) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.BEIJING) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.BEIJING) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
 
 }
 public String getTicketNumber(int index){
    setTicketNumber(index);
    return ticketNumber[index];
 }
 
 
 
 
 
 
 //task 8
 private double totalTicketPrice;
 public void setTotalTicketPrice(){
   this.totalTicketPrice = 2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250)));
   //this.totalTicketPrice=Math.abs((((child *((300 + (0.1*300)) + (0.05*300))) + (adults*((300 + (0.1*300)) + (0.05*300)))) + 250)*2);
 }
 public double getTotalTicketPrice(){
   return totalTicketPrice;
 }
 private double departingTicketPrice;
 private double returnTicketPrice;
 public void setDepartingTicketPrice(int child,int adult){
   this.departingTicketPrice=departingTicketPrice;
 }
 public double getDepartingTicketPrice(){
   return departingTicketPrice;
 }
 public void setReturnTicketPrice(){
   this.returnTicketPrice=returnTicketPrice;
 }
 public double getReturnTicketPrice(){
   return returnTicketPrice;
 }
 
 
 
 //task 9
 private ConfirmationMessage ConfirmationMessage;
 public enum ConfirmationMessage{
   CHANGE,NOTCHANGE;
 }
 public void setConfirmationMessage(String confirmationMessage){
 switch(confirmationMessage){
   case "1":
   this.ConfirmationMessage = ConfirmationMessage.CHANGE;
   System.out.println("Thank you for booking your flight with " + flightCompany + ". Following are the details \n" +
           "of your booking and the trip: \n" +
           "Ticket Number: " + ticketNumber + "\n" +
           "Passenger Name: " + passengerFullName + "\n" +
           "From TripSource to " + tripDestination + "\n" +
           "Date of departure: " + departureDate + "\n" +
           "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
           returnDate + ")\n" +
           "Total passengers: " + totalPassengers + "\n" +
           "Total ticket price in Euros: " + totalTicketPrice + "\n" +
           "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
           "less than two days apart from your departure date");
   break;
 case "2":
   this.ConfirmationMessage = ConfirmationMessage.NOTCHANGE;
   System.out.println("Thank you for booking your flight with " + flightCompany + ".Following are the details \n" +
           "of your booking and the trip: \n" +
           "Ticket Number: " + ticketNumber + "\n" +
           "Passenger Name: " + passengerFullName + "\n" +
           "From TripSource to " + tripDestination + "\n" +
           "Date of departure: " + departureDate + "\n" +
           "Date of return: " + returnDate + "\n" +
           "Total passengers: " + totalPassengers + "\n" +
           "Total ticket price in Euros: " + totalTicketPrice + "\n");
 
   break;
 }
 }




private String [] passengerFullName={"Matt Jive", "Sally Fields", "Posh Quattro"};
public void setPassengerFullName(int index ,String passengerFullName){
    this.passengerFullName=new String[]{"Matt Jive", "Sally Fields", "Posh Quattro"};
}
public String getPassengerFullName(int index){
    return passengerFullName[index];
}



private String [] passengerGender={"Male", "Female", "Other"};
public void setPassengerGender(int index,String passengerGender){
    this.passengerGender=new String[]{"Male", "Female", "Other"};
}
public String getPassengerGender(int index){
    return passengerGender[index];
}


private int [] passengerAge={43, 32, 21};
public void setPassengerAge(int index, int passengerAge){
    this.passengerAge=new int[]{43, 32, 21};
}
public int getPassengerAge(int index){
    return passengerAge[index];
}

 int number;
public FlightBooking(String passengerFullName,LocalDate depart,LocalDate returnDate,int childPassengers, int adultPassengers){
    this.passengerFullName = new String[1];
    this.passengerFullName[0] = passengerFullName;
    setDepartureDate(depart);
    setReturnDate(returnDate);
    this.childrenPassengers = childPassengers;
    this.adultPassengers = adultPassengers;
    setTotalPassengers(childPassengers,adultPassengers);
    //setFlightID();
}
public FlightBooking(int number){
    this.passengerFullName = new String[number];
    this.passengerGender = new String[number];
    this.passengerAge = new int[number];
    this.ticketNumber = new String[number];
    this.number = number;




}


public void setSourceAirport(String sourceAirport){
switch(sourceAirport){
    case "1":
    this.sourceAirport=Airport.NANJING_LUKOU_AIRPORT;
    break;
    case "2":
    this.sourceAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
    break;
    case "3":
    this.sourceAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
    break;
    case "4":
    this.sourceAirport=Airport.OULU_AIRPORT;
    break;
    case "5":
    this.sourceAirport=Airport.PARIS_CHARLES_DE_GAULLE_FIRPORT;
    break;
    default:
    System.out.println("Invaild choice");
    break;
}
}
public Airport getSourceAirport(){
    return sourceAirport;
}

public void setDestinationAirport(String sourceAirport ,String destinationAirport){
    switch(destinationAirport){
        case "1":
        this.destinationAirport=Airport.NANJING_LUKOU_AIRPORT;
        break;
        case "2":
        this.destinationAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
        break;
        case "3":
        this.destinationAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
        break;
        case "4":
        this.destinationAirport=Airport.OULU_AIRPORT;
        break;
        case "5":
        this.destinationAirport=Airport.HELSINKI_AIRPORT;
        break;
        default:
        System.out.println("Invaild choice");
        break;
    }
}

public Airport getDestinationAirport(){
    return destinationAirport;
}



Scanner scanner=new Scanner(System.in);
int totalTickets;
public void reserveTickerts(){
for(int j=0;j<totalTickets;j++){
  System.out.println("Please enter your details:"+(j+1));
  System.out.println("Your full name: ");
  setPassengerFullName(j, scanner.nextLine());
  System.out.println("Your gender: ");
  setPassengerGender(j, scanner.nextLine());
  System.out.println("Your age: ");
  setPassengerAge(j, scanner.nextInt());
}
}


}
