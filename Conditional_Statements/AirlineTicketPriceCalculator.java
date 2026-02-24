import java.util.Scanner;
public class AirlineTicketPriceCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bookStringClass=sc.nextLine();
        int daysUnitDeparture=sc.nextInt();
        double seatAvailability=sc.nextDouble();
        String rotueType=sc.next();
        double basePrice=0;
        double demand=0;
        double finalPrice=0;
        String category=" ";
        if(bookStringClass.equalsIgnoreCase("Economy")){
            if(rotueType.equalsIgnoreCase("Domestic")){
                basePrice=200;
            }
            if(rotueType.equalsIgnoreCase("International-Short")){
                basePrice=500;
            }
            if(rotueType.equalsIgnoreCase("International-Long")){
                basePrice=800;
            }
        }
        else if(bookStringClass.equalsIgnoreCase("Bussiness")){
            if(rotueType.equalsIgnoreCase("Domestic")){
                basePrice=600;
            }
            if(rotueType.equalsIgnoreCase("International-Short")){
                basePrice=1500;
            }
            if(rotueType.equalsIgnoreCase("International-Long")){
                basePrice=2500;
            }
        }
        if(bookStringClass.equalsIgnoreCase("First")){
            if(rotueType.equalsIgnoreCase("Domestic")){
                basePrice=1000;
            }
            if(rotueType.equalsIgnoreCase("International-Short")){
                basePrice=3000;
            }
            if(rotueType.equalsIgnoreCase("International-Long")){
                basePrice=5000;
            }
        }
        if((seatAvailability>=0 && seatAvailability<=100)&&(daysUnitDeparture>0 && daysUnitDeparture<=365)){
        if(seatAvailability<30 && daysUnitDeparture<14){
                    demand=1.8;
                    category="High Demand";
        }
        if(seatAvailability<50 && daysUnitDeparture<30){
                    demand=1.5;
                    category="High Demand";
        }
        if(seatAvailability<60 || (daysUnitDeparture>=30&&daysUnitDeparture<=60)){
                    demand=1.0;
                    category="Moderate";
        }
        if(seatAvailability>=60 && daysUnitDeparture>60){
                    demand=0.8;
                    category="Low Demand";
        }
        finalPrice=basePrice*demand;
        }
        System.out.println("Booking Class: "+bookStringClass);
        System.out.println("Days Until Departure: "+daysUnitDeparture);
        System.out.println("Seat Availability: "+seatAvailability);
        System.out.println("Route Type: "+rotueType);
        System.out.println("Base Price: $"+basePrice);
        System.out.println("Demand Multiplier: "+demand+"X");
        System.out.println("Final Ticaket Price: $"+finalPrice);
        System.out.println("Pricing Category: "+category);
        sc.close();
    }
}

