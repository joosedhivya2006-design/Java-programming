import java.util.Scanner;
public class DailyTemperatureMonitoring {
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
        for(int i=0;i<n;i++){
            if(a[i]>max){max=a[i];}
            if(a[i]<min){min=a[i];}
            sum+=a[i];
        }
        double range=max-min;
        double avg=sum/n;
        System.err.println("Number of Readings: "+n);
        System.out.printf("Maximum Temperature: %.2f°C\n",max);
        System.out.printf("Minimum Temperature: %.2f°C\n",min);
        System.out.printf("Temperature Range: %.2f°C\n",range);
        System.out.printf("Average Temperature: %.2f°C\n",avg);
    }
}
