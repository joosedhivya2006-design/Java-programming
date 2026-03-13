import java.util.Scanner;

public class SmartHomeEnergyConsumptionAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
        }
        double dl=sc.nextDouble();
        double sum=0;
        double max=a[0];
        int index=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(a[i]>max){
                max=a[i];
                index=i;
            }
        }
        double avg=sum/n;
        System.err.println("Hours Monitored: "+n);
        System.out.printf("Total Daily Consumption: %.2f kWh\n",sum);
        System.out.printf("Peak Hour: Hour %d (%.2f kWh)\n",index+1,max);
        System.out.printf("Average Hourly: %.2f kWh\n",avg);
        System.out.println("Daily Limit: "+dl+" kWh");
        if(sum<dl){
            System.out.println("Status: Within Limit");
        }
        else{
            System.out.printf("Status: Exceeded by %.2f kWh\n",sum-dl);
        }
        sc.close();
    }
}
