import java.util.Scanner;

public class ProductPriceDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double discount=0;
        double subtotal=0;
        double sum=0;
        double dprice=0;
        double savings=0;
        double total=0;
        double originaltotal=0;
        int qsum=0;
        for(int i=1;i<=n;i++){
            String productname=sc.next();
            double price=sc.nextDouble();
            int quantity=sc.nextInt();
            if(quantity>=2 && quantity<=4){
                discount=10;
            }
            else if(quantity>=5 && quantity<=9){
                discount=15;
            }
            else if(quantity>=10){
                discount=20;
            }
            else{
                discount=0;
            }
            subtotal=price*quantity*(1-discount/100.0);
            sum+=subtotal;
            qsum+=quantity;
            total=price*quantity;
            System.out.println("Product: "+productname);
            System.out.println("Unit Price: "+price);
            System.out.println("Quantity: "+quantity);
            System.out.println("Discount: "+discount);
            System.out.println("Subtotal: "+subtotal);
            originaltotal+=total;
        }
        dprice=total-subtotal;
        savings=(dprice/originaltotal)*100.0;
        System.out.println("Total Items: "+qsum);
        System.out.println("Original Total: $"+originaltotal);
        System.out.println("Total Discount: "+dprice+"%");
        System.out.println("Final Total: $"+sum);
        System.out.printf("Savings: %.2f%%\n",savings);
        sc.close();
    }
}
