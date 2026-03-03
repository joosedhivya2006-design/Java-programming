import java.util.Scanner;
public class ProductWarrantyRegistrationSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int warranty=0;
        int rem=0;
        String status="";
        int active=0,expired=0,expiring=0;
        for(int i=1;i<=n;i++){
            String productID=sc.next();
            String productType=sc.next();
            int monthsSincePurchase=sc.nextInt();
            if(productType.equalsIgnoreCase("Electronics")){
                warranty=12;
            }
            if(productType.equalsIgnoreCase("Appliance")){
                warranty=24;
            }
            if(productType.equalsIgnoreCase("Computer")){
                warranty=36;
            }
            rem=warranty-monthsSincePurchase;
            if(rem<0){ 
                rem=0;
                status="Expired";
                expired++;
            }
            else if(rem>=1 && rem<=3){
                status="Expiring Soon";
                expiring++;
            }
            else if(rem>3){
                status="Active";
                active++;
            }
            System.out.println("Product ID: "+productID);
            System.out.println("Type: "+productType);
            System.out.println("Warranty Period: "+warranty);
            System.out.println("Months Used: "+monthsSincePurchase);
            System.out.println("Remaining Months: "+rem+"months");
            System.out.println("Status: "+status);

        }
        System.out.println("Total Products: "+n);
        System.out.println("Active Warranties: "+active);
        System.out.println("Expiring Soon: "+expiring);
        System.out.println("Expired Warranties: "+expired);
        sc.close();
    }
}
