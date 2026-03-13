import java.util.Scanner;

public class WarehouseInventoryTurnover {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        double sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        double avg=sum/n;
        double t=avg*(0.5);
        int max=a[0];
        int ind=0;
        int index=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){max=a[i];ind=i+1;}
            if(a[i]<t){
                count++;
            }
        }
        System.out.println("Total Productts: "+n);
        System.out.println("Total Units Sold: "+sum);
        System.out.printf("Average Monthly Sales: %.2f\n",avg);
        System.out.printf("Best Seller: product %d (%d units)\n",ind,max);
        System.out.println("Slow-Moving Products: "+count);
        System.out.printf("Turnover Threshold: %.2f\n",t);
        System.out.print("Clearance Candidates: [");
        for(int i=0;i<n;i++){
            if(a[i]<t){
            index=i+1;
            if(i<n-1){System.out.print(index+", ");}
            else{System.out.print(index);}  
            }
        }
        System.out.print("]");
        sc.close();
    }
}
