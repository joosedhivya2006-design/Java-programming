import java.util.Scanner;

public class AirlinrFlightDelayAnalysis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        double sum=0;
        int max=a[0];
        int ot=0;
        int compensation=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<=15){ot++;}
            if(a[i]>180){compensation++;}

        }
        double avg=sum/n;
        double per=ot/n*100;
        System.out.println("Total Flights: "+n);
        System.out.printf("Average Delay: %.2f minutes\n",avg);
        System.out.println("Maximum Delay: "+max+" minutes");
        System.out.println("on-Time Flights: "+ot);
        System.out.println("Compensation Required: "+compensation);
        System.out.printf("On-Time Performance: %.2f\n",per);
        sc.close();
    }
}
