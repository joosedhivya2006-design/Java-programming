import java.util.Scanner;

public class WaterQualityMonitoring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        double sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
            sum+=a[i];
        }
        double max=a[0];
        double min=a[0];
        int count=0;
        double avg=sum/n;
        for(int i=0;i<n;i++){
            if(a[i]>max){max=a[i];}
            if(a[i]<min){min=a[i];}
            if(a[i]<6.5 || a[i]>8.5){count++;}
        }
        double s=(double)(n-count)/n*100.0;
        System.out.println("Total Samples: "+n);
        System.out.printf("Average pH: %.2f\n",avg);
        System.out.printf("Minimum pH: %.2f\n",min);
        System.out.printf("Maximum pH: %.2f\n",max);
        System.out.println("Unsafe Samples: "+count);
        System.out.printf("Safety Compilance: %.2f%%\n",s);
        System.out.print("Critical Alerts: [");
        int ind=0;
        for(int i=0;i<n;i++){
            if(a[i]<6.5 || a[i]>8.5){ind=i+1;
                if(ind<n-1){
                    System.out.print(ind+", ");}
                else{System.out.print(ind);}
            }
        }
        System.out.print("]");
    }
}
