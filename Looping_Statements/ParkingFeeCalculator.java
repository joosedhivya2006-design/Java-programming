import java.util.Scanner;
public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double baseRate=0;
        double fee=0;
        double dailycap=0;
        int count=0;
        double total=0;
        double min=0;
        String capApplied="";
        for(int i=1;i<=n;i++){
            String vehicleType=sc.next();
            double hoursParked=sc.nextDouble();
            if(vehicleType.equalsIgnoreCase("Car")){
                baseRate=3;
                dailycap=30;
            }
            if(vehicleType.equalsIgnoreCase("Motorcycle")){
                baseRate=2;
                dailycap=20;
            }
            if(vehicleType.equalsIgnoreCase("Truck")){
                baseRate=5;
                dailycap=60;
            }
            if(vehicleType.equalsIgnoreCase("Bus")){
                baseRate=7;
                dailycap=100;
            }
            fee=hoursParked*baseRate;
            if(fee<dailycap){
                min=fee;
                capApplied="No";
            }
            else if(fee>=dailycap){
                min=dailycap;
                capApplied="Yes";
            }
            if(hoursParked>8){
                count++;
            }
            total+=min;
            System.out.println("Vechicle "+i+": "+vehicleType);
            System.out.println("Hours Parked: "+hoursParked);
            System.out.println("Hourly Rate: "+baseRate);
            System.out.println("Parking Fee: "+min);
            System.out.println("Cap Apllied: "+capApplied);
        }
        double avg=total/n;
        System.out.println("Total Vechicle: "+n);
        System.out.println("Total Revenue: "+total);
        System.out.printf("Average Fee: %.2f\n",avg);
        System.out.println("Peak Hour Vechicles: "+count);
        sc.close();
    }
}
