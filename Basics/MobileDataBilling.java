import java.util.Scanner;
public class MobileDataBilling{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double baseCost=sc.nextDouble();
double extraGB=sc.nextDouble();
double ratePerGB=sc.nextDouble();
double tax=sc.nextDouble();
double extraCharges=extraGB*ratePerGB;
double subtotal=baseCost+extraCharges;
double taxAmount=subtotal*(tax/100);
double totalBill=subtotal+taxAmount;
System.out.println("Total Bill = "+totalBill);
sc.close();
}
}
