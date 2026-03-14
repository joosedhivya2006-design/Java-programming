import java.util.Scanner;

public class NetworkServerResponseTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        int count=0;
        double sum=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){max=a[i];}
            if(a[i]<min){min=a[i];}
            sum+=a[i];
            if(a[i]>200){count++;}
        }
        double avg=sum/n;
        double p=(double)(n-count)/n*100.0;
        System.out.println("Total Servers: "+n);
        System.out.printf("Fastest Response: %dms\n",min);
        System.out.printf("Slowest Response: %dms\n",max);
        System.out.printf("Average Response: %.2fms\n",avg);
        System.out.println("Slow Servers(>200ms): "+count);
        System.out.printf("Performance Score: %.2f%%\n",p);
        sc.close();
    }
}
