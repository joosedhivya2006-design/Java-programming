import java.util.Scanner;
public class  RoomBookingAndPricing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String room=sc.next();
        String season=sc.next();
        int nights=sc.nextInt();
        String loyaltytier=sc.next();

        double baserate=0.0;
        if(room.equals("Standard")){
            baserate=150.0;
        }
        else if(room.equals("Deluxe")){
            baserate=300.0;
        }
        else if(room.equals("Suite")){
            baserate=500.0;
        }
        else if(room.equals("Presidential")){
            baserate=1000.0;
        }
        // seasonal multiplier
        double seamul=0.0;
        if(season.equals("Off-Peak")){
            seamul=0.7;
        }
        else if(season.equals("Regular")){
            seamul=1.0;
        }
        else if(season.equals("Peak")){
            seamul=1.5;
        }
        else if(season.equals("Holiday")){
            seamul=2.0;
        }

        // stay discount
        int sdis=0;
        if(nights>=1 && nights<=4){
            sdis=0;
        }
        else if(nights>=5 && nights<=7){
            sdis=5;
        } 
        if(nights>=8 && nights<=14){
            sdis=10;
        }
        if(nights>=15){
            sdis=20;
        }

        //loyalty discount
        int ldis=0;
        if(loyaltytier.equals("None")){
            ldis=0;
        }
        else if(loyaltytier.equals("Member")){
            ldis=10;
        }
        else if(loyaltytier.equals("Gold")){
            ldis=15;
        }
        else if(loyaltytier.equals("Platinum")){
            ldis=20;
        }

        double srate=baserate*seamul;
        double disrate=srate*(1-(sdis/100.0))*(1-(ldis/100.0));
        double totcost=disrate*nights;

        String cat=" ";
        if(loyaltytier.equals("None")){
            cat="None";
        }
        else if(loyaltytier.equals("Gold")){
            cat="Free breakfast and spa access";
        }
        else if(loyaltytier.equals("Member")){
            cat="Free breakfast";
        }
        else if(loyaltytier.equals("Platinum")){
            cat="Concierge service, airport transfer, and fine dining";
        }


    System.out.println("Room Category:"+room);
    System.out.println("Season: "+season);
    System.out.println("Nights Booked: "+nights);
    System.out.println("Loyalty Tier: $"+nights);
    System.out.println("Base Rate Per Night: $"+baserate);
    System.out.println("Seasonal Multiplier: "+seamul+"x");
    System.out.println("Extended Stay Discount:"+sdis+"%");
    System.out.println("Loyalty Discount: "+ldis+"%");
    System.out.println("Nightly Rate: "+seamul*baserate);
    System.out.println("Total Booking Cost: $"+totcost);
    System.out.println("Complimentary Upgrades:"+cat);

        sc.close();

    }
}