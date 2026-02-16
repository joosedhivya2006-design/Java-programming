import java.util.Scanner;
public class RailwayTicketRevenue{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int genPass=sc.nextInt();
int genFare=sc.nextInt();
int acPass=sc.nextInt();
int acFare=sc.nextInt();
int platformCollection=sc.nextInt();
int maintenanceCost=sc.nextInt();
int fuelCost=sc.nextInt();
int netRevenue=(genPass*genFare)+(acPass*acFare)+platformCollection-maintenanceCost-fuelCost;
System.out.println("Net Railway Revenue = "+netRevenue);
sc.close();
}
}
