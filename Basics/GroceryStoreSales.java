import java.util.Scanner;
public class GroceryStoreSales{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double sales=sc.nextDouble();
double discount=sc.nextDouble();
double gst=sc.nextDouble();
double discountAmount=sales*(discount/100);
double discountedPrice=sales-discountAmount;
double gstAmount=discountedPrice*(gst/100);
double finalRevenue=discountedPrice+gstAmount;
System.out.println("Final Revenue = "+finalRevenue);
sc.close();
}
}
