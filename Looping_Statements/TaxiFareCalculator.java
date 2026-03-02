import java.util.Scanner;

public class TaxiFareCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double basePrice=3.00;
        double charge=0;
        double surCharges=0;
        double total_fare=0;
        double total_distance=0;
        double total_revenue=0;
        for(int i=1;i<=n;i++){
            double distance=sc.nextDouble();
            String timeOfDay=sc.next();
            charge=distance*1.00;
            if(timeOfDay.equalsIgnoreCase("Morning")){
                surCharges=0;
            }
            if(timeOfDay.equalsIgnoreCase("Afternoon")){
                surCharges=0;
            }
            if(timeOfDay.equalsIgnoreCase("Evening")){
                surCharges=3;
            }
            if(timeOfDay.equalsIgnoreCase("Night")){
                surCharges=5;
            }
            total_fare=basePrice+charge+surCharges;
            total_distance+=distance;
            total_revenue+=total_fare;
            System.out.println("Ride: "+i);
            System.out.println("Distance: "+distance+" km");
            System.out.println("Time: "+timeOfDay);
            System.out.println("Base Fare: $"+basePrice);
            System.out.println("Distance Charge: $"+charge);
            System.out.println("Time Surcharge: "+surCharges);
            System.out.println("Total Fare: $"+total_fare);
        }
        System.out.println("Total Rides: "+n);
        System.out.println("Total Distance: "+total_distance);
        System.out.println("Total Revenue: "+total_revenue);
        System.out.println("Average Fare: "+(total_revenue/n));
        sc.close();
    }
}
