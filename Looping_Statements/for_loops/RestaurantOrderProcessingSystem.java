import java.util.Scanner;

public class RestaurantOrderProcessingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double ordertotal=0;
        double totalitem=0;
        double subtotal=0;
        for(int i=1;i<=n;i++){
            String itemName=sc.next();
            double price=sc.nextDouble();
            int quantity=sc.nextInt();
            subtotal=price*quantity;
            ordertotal+=subtotal;
            totalitem+=quantity;
            System.out.println("Items: "+itemName);
            System.out.println("Price: "+price+" X "+quantity);
            System.out.println("Subtotal: "+subtotal);
        }
        double tax=subtotal*0.08;
        double serviceCharge=subtotal*0.10;
        double grandTotal=subtotal+tax+serviceCharge;
        System.out.println("Total Items: "+totalitem);
        System.out.println("Subtotal: $"+ordertotal);
        System.out.println("Tax(8%): $"+tax);
        System.out.println("Service Charge: (10%): $"+serviceCharge);
        System.out.println("Grand Total: $"+grandTotal);
        sc.close();
    }
}
