import java.util.Scanner;
public class EcommerceProductPrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
        }
        double max=a[0];
        double min=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min){min=a[i];}
            if(a[i]>max){max=a[i];}
        }
        double savings=((max-min)*100.0)/max;
        System.out.println("Number of Sellers: "+n);
        System.out.printf("Lowest Price: $%.2f\n",min);
        System.out.printf("Highest Price: $%.2f\n",max);
        System.out.printf("Price Difference: $%.2f\n",max-min);
        System.out.printf("Savings: %.2f%%",savings);

    }
}
