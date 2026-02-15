import java.util.Scanner;
public class RestaurantBillSplitter{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double totalBill=sc.nextDouble();
double service=sc.nextDouble();
double gst=sc.nextDouble();
int numberOfPeople=sc.nextInt();
double serviceAmount=totalBill*(service/100);
double billWithService=totalBill+serviceAmount;
double gstAmount=billWithService*(gst/100);
double finalBill=billWithService+gstAmount;
double amountPerPerson=finalBill/numberOfPeople;
System.out.println("Amount Per Person = "+amountPerPerson);
sc.close();
}
}
