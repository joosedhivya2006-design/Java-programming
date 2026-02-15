import java.util.Scanner;
public class HotelRevenueCalculator{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int rooms=sc.nextInt();
int price=sc.nextInt();
int serviceCharges=sc.nextInt();
int commission=sc.nextInt();
int totalRevenue=(rooms*price)+serviceCharges-commission;
System.out.println("Total Revenue = "+totalRevenue);
sc.close();
}
}
