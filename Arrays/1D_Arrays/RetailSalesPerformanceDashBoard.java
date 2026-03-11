import java.util.Scanner;

public class RetailSalesPerformanceDashBoard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
        }
        double max=a[0];
        double min=a[0];
        double sum=0;
        int index1=0;
        int index2=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
                index1=i;
            }
            if(min>a[i]){
                min=a[i];
                index2=i;
            }
            sum+=a[i];
        }
        double avg=(double)sum/n;
        System.out.println("Total Stores: "+n);
        System.out.printf("Highest Sales: $%.2f (Store %d)\n",max,index1);
        System.out.printf("Lowest Sales: $%.2f (Store %d)\n",min,index2);
        System.out.printf("Total Sales: $%.2f \n",sum);
        System.out.printf("Average Sales: $%.2f\n",avg);
        sc.close();
    }
}