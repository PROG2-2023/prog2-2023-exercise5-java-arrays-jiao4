package prog2.exercise5.flight.booking.system;

      import java.time.LocalDate;
      import java.util.Random;
      import java.time.Period;
      import java.util.Scanner;

      public class FlightBooking
      {
       private String[] PassengerFullName={"Matt Jive", "Sally Fields", "Posh Quattro"};
       private String  [] PassengerGender= {"Male", "Female", "Other"};
       private int [] PassengerAge={43, 32, 21} ;
       private String [] ticketNumber;
       int x;


       private String FlightCompany;
       private double TotalTicketPrice;
       private int ChildPassengers;
       private int AdultPassengers;
       private int TotalPassengers;
       public TripDestination tripDestination;
       private  BookingClass bookingClass;
       private TripType tripType;
       public TripSource tripSource;
       public Airport sourceAirport;
       public Airport destinationAirport;
    
    
    
         
       
       FlightBooking(int x){
        this.PassengerFullName = new String[x];
        this.PassengerGender = new String[x];
        this.PassengerAge = new int[x];
        this.ticketNumber = new String[x];
    
       }
        FlightBooking(String a, LocalDate depart, LocalDate returnDate, int w, int e) 
       {
       this.PassengerFullName = new String[1];
       this.ChildPassengers =w;
       this.AdultPassengers =e;
       setDepartureDate(depart);
       setReturnDate(returnDate);
       //setTotalPassengers(w,e);
       } 

    public void setPassengerFullName(int x,String passengerFullName) 
    {
        this.PassengerFullName [x] = passengerFullName;
    }
    public String getPassengerFullName(int x) 
    {
        return PassengerFullName[x];
    }
    

    public void setPassengerGender(int x,String passengerGender) 
    {
        this.PassengerGender[x] = passengerGender;
    }
    public String getPassengerGender(int x) 
    {
        return PassengerGender[x];
    }
    

    public void setPassengerAge(int x,int passengerAge) 
    {
        this.PassengerAge[x] = passengerAge;
    }
    public int getPassengerAge(int x) 
    {
        return PassengerAge[x];
    } 
     
     
    public void setSourceAirport(String sourceAirport){
        switch(sourceAirport)
        {
            case "1":
            this.sourceAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
            break;
            case "2":
            this.sourceAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
            break;
            case "3":
            this.sourceAirport=Airport.SHANGHAI_PUDON_INTERNATIONAL_AIRPORT;
            break;
            case "4":
            this.sourceAirport=Airport.OULU_AIRPORT;
            break;
            case "5":
            this.sourceAirport=Airport.HELSINKI_AIRPORT;
            break;
            default:
            System.out.println("Please,choose again");
            break;
        }
    }
    public Airport getSourceAirport()
    {
        return sourceAirport;
    }
        
    public void setDestinationAirport(String sourceAirport ,String destinationAirport){
        switch(destinationAirport)
        {
            case "1":
            this.destinationAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
            break;
            case "2":
            this.destinationAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
            break;
            case "3":
            this.destinationAirport=Airport.SHANGHAI_PUDON_INTERNATIONAL_AIRPORT;
            break;
            case "4":
            this.destinationAirport=Airport.OULU_AIRPORT;
            break;
            case "5":
            this.destinationAirport=Airport.HELSINKI_AIRPORT;
            break;
            default:
            System.out.println("Please,choose again");
            break;
        }
    }
        
    public Airport getDestinationAirport()
    {
        return destinationAirport;
    }
        
     
     
    Scanner scanner=new Scanner(System.in);
    int totalTickets;
    public void reserveTickets(int x){
    System.out.println("Thank you for booking your flights with "+FlightCompany+
                        ".\nYou reserved a total of "+totalTickets+".tickets");
    for(int j=0;j<totalTickets;j++)
       {
        System.out.println("Here are the trip details for Passenger No."+(j+1));
        System.out.println("Please enter your details:"+(j+1));
        System.out.println("Your full name: ");
        setPassengerFullName(j, scanner.nextLine());
        System.out.println("Your gender: ");
        setPassengerGender(j, scanner.nextLine());
        System.out.println("Your age: ");
        setPassengerAge(j, scanner.nextInt());
        System.out.println("The flight departs on: 2023-04-12");
        System.out.println("And the return flight is on: 2023-05-12");
      }
    }

     



     
       enum BookingClass
       {
       FIRST,BUSINESS,ECONOMY;
       }
       enum TripType
       {
        ONE_WAY, RETURN;
       }
       enum TripSource 
       {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS;
       }
       enum Airport{
        NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
        SHANGHAI_PUDON_INTERNATIONAL_AIRPORT, OULU_AIRPORT,HELSINKI_AIRPORT,
        PARIS_CHARLES_DE_GAULLE_AIRPORT
        }
       enum TripDestination 
       {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS;
       }
       
       public String getFlightCompany()
       {return FlightCompany;
       }
       public int getTotalPassengers()
       {return TotalPassengers;
       }
       public int getChildPassengers()
       {return ChildPassengers;
       }
       public int getAdultPassengers()
       {return AdultPassengers;
       }
       public void setFlightCompany(String FlightCompany)
       {this.FlightCompany = FlightCompany;
       }
    
       
     
       public void setBookingClass(String bookingClass)
       {
       switch (bookingClass) 
        {
    
        case"1":
        this.bookingClass = BookingClass.FIRST;;
        break;
        
        case"2":
        this.bookingClass = BookingClass.BUSINESS;
        break;
        
        case"3":
        this.bookingClass = BookingClass.ECONOMY;
        break;
        default:
        System.out.println("choice again");
        }
       }
       public BookingClass getBookingClass()
       {
       return bookingClass;
       }
    
       public void setTripType(String tripType ) 
        {
        switch (tripType )
         {
          case "1":
          this.tripType = TripType.ONE_WAY;
          break;
          case "2":
          this.tripType = TripType.RETURN;
          break;
          default:
          System.out.println("choice again");
         }
        }
       public TripType getTripType()
       {
       return tripType;
       }
       

        public void setTripSource(String tripSource){
         switch(tripSource){
           case "1":
           this.tripSource=TripSource.NANJING;
           this.sourceAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
           break;
           case "2":
           this.tripSource=TripSource.BEIJING;
           this.sourceAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
           break;
           case "3":
           this.tripSource=TripSource.SHANGHAI;
           this.sourceAirport=Airport.SHANGHAI_PUDON_INTERNATIONAL_AIRPORT;
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
           this.sourceAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
           break;
           default:
           System.out.println("choose again");
           break;
         }
       }
       public TripSource getTripSource()
       {
        return tripSource;
       }
    
    
       public void setTripDestination(String tripSource , String tripdestination)
    {
        if(sourceAirport.equals(destinationAirport))
        {
            System.out.println("choose again");
           
        }
        else
        {
        switch(tripdestination){
          case "1":
          this.tripDestination=TripDestination.NANJING;
          this.destinationAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
          break;
          case "2":
          this.tripDestination=TripDestination.BEIJING;
          this.destinationAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
          break;
          case "3":
          this.tripDestination=TripDestination.SHANGHAI;
          this.destinationAirport=Airport.SHANGHAI_PUDON_INTERNATIONAL_AIRPORT;
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
          this.destinationAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
          break;
          default:
          System.out.println("choose again");
          break;
            }
        }
    }
    
     public LocalDate departureDate;
     public LocalDate returnDate;
     public void setDepartureDate(LocalDate departureDate)
     {
        String sdepart ="2023-04-12";
        // String departureDate = "2023-05-12";
        this.departureDate=LocalDate.parse(sdepart);
     }
     public LocalDate getDepartureDate()
     {
        // String departureDate = "2023-05-12";
        return departureDate;
     }
     public void setReturnDate(LocalDate returnDate)
     {
     this.returnDate=departureDate.plusDays(2);
     long i = departureDate.toEpochDay() - returnDate.toEpochDay();
       
       if(i>=0 && i<1)
       {
       this.returnDate=departureDate.plusDays(2);
       }   
       else if(i>=1 && i<2)
       {
       this.returnDate=departureDate.plusDays(1);
       } 
     }
     
     public LocalDate getReturnDate()
     {
     return returnDate;
     }
    
    
    Random random=new Random();
    public void setTicketNumber(int x){
      String ticketNumber=null;
       switch (tripType) {
          case ONE_WAY:
              ticketNumber = "11";
              break;
          case RETURN:
              ticketNumber = "22";
              break;
      }
      switch (bookingClass) {
          case FIRST:
              ticketNumber = ticketNumber + "F";
              break;
          case BUSINESS:
              ticketNumber = ticketNumber + "B";
              break;
          case ECONOMY:
              ticketNumber = ticketNumber + "E";
              break;
      }
      for (int i = 0; i < 4; i++) {
          char f = (char) ((random.nextInt(26) + 65));
          ticketNumber = ticketNumber + f;
      }
      this.ticketNumber = new String[]{ticketNumber + "DOM"};
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
    
    public String getTicketNumber(int x){
        setTicketNumber(x);
        return ticketNumber[x];
     }
    
    
    private ConfirmationMessage confirmationMessage;
    enum ConfirmationMessage{
      CHANGE,NOTCHANGE;
    }
    public void setConfirmationMessage(String confirmationMessage) {
      switch (confirmationMessage) {
          case "1":
              this.confirmationMessage = ConfirmationMessage.CHANGE;
              System.out.println("Thank you for booking your flight with " + FlightCompany + ". Following are the details \n" +
                      "of your booking and the trip: \n" +
                      "Ticket Number: " + ticketNumber + "\n" +
                      "Passenger Name: " + PassengerFullName + "\n" +
                      "From TripSource to " + tripDestination + "\n" +
                      "Date of departure: " + departureDate + "\n" +
                      "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                      returnDate + ")\n" +
                      "Total passengers: " + TotalPassengers + "\n" +
                      "Total ticket price in Euros: " + TotalTicketPrice + "\n" +
                      "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                      "less than two days apart from your departure date");
              break;
          case "2":
              this.confirmationMessage = ConfirmationMessage.NOTCHANGE;
              System.out.println("Thank you for booking your flight with " + FlightCompany + ".Following are the details \n" +
                      "of your booking and the trip: \n" +
                      "Ticket Number: " + ticketNumber + "\n" +
                      "Passenger Name: " + PassengerFullName + "\n" +
                      "From TripSource to " + tripDestination + "\n" +
                      "Date of departure: " + departureDate + "\n" +
                      "Date of return: " + returnDate + "\n" +
                      "Total passengers: " + TotalPassengers + "\n" +
                      "Total ticket price in Euros: " + TotalTicketPrice + "\n");
    
              break;
      }
    
    
    }
    
    public void setTotalTicketPrice() {
    
        this.TotalTicketPrice = 2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250)));
    }
    public double getTotalTicketPrice(){
        return TotalTicketPrice;
    }
    
    private double departingTicketPrice;
    private double returnTicketPrice;
    public void setDepartingTicketPrice(int child , int adult){
        this.departingTicketPrice= departingTicketPrice+0;
    }
    public double getDepartingTicketPrice(){
        return departingTicketPrice;
    }
    
    
    public void setReturnTicketPrice()
    {
        this.returnTicketPrice=returnTicketPrice+0;
    }
    public double getReturnTicketPrice()
    {
        return returnTicketPrice;
    }
    }
    

