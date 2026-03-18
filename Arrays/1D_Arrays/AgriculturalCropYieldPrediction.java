import java.util.Scanner;
public class AgriculturalCropYieldPrediction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
        }
        double sum=0;
        double max=a[0];
        for(int i=0;i<n;i++){
            sum+=a[i]; 
        }
        double avg=sum/n;
        double t=avg*0.8;
        int count=0,plot=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
                plot=i+1;
            }
            if(a[i]<t){
                count++;
            }
        }
        System.out.println("Total Plots: "+n);
        System.out.printf("Total Harvest: %.2f tons",sum);
        System.out.println("Average Yield: "+avg+" tons/acre");
        System.out.printf("Highest Yield: %.2f tons/acre (plot %d)\n",max,plot);
        System.out.println("Underperforming Plots: "+count);
        System.out.printf("Performance Threshold: %.2f tons/acre",t);
        sc.close();
    }
}
