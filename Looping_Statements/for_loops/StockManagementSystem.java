import java.util.Scanner;

public class StockManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double reorder=0;
        int low=0;
        int critical=0;
        String status="";
        double sum=0;
        for(int i=1;i<=n;i++){
        String product_name=sc.next();
        int currentStock=sc.nextInt();
        int min_stock=sc.nextInt();
        if(currentStock>=min_stock){
            status="Adequate";
            reorder=0;
        }
        if(currentStock<min_stock && currentStock>=min_stock/2){
            status="Low Stock";
            reorder=(min_stock-currentStock)+min_stock/2;
            low++;
        }
        if(currentStock<min_stock/2){
            status="Critical";
            reorder=(min_stock-currentStock)+min_stock*1.5;
            critical++;
        }
        sum=sum+reorder;
        System.out.println("Product: "+product_name);
        System.out.println("Current Stock: "+currentStock);
        System.out.println("Minimum Stock: "+min_stock);
        System.out.println("Status: "+status);
        System.out.println("Reorder Quantity: "+(int)reorder);
        }
        System.out.println();
        System.out.println("Total Products: "+n);
        System.out.println("Low Stock Items: "+low);
        System.out.println("Critical Items: "+critical);
        System.out.println("Total Reorder Quantity: "+(int)sum);
        sc.close();
    }
}
