import java.util.Scanner;

public class CustomerServiceCallCenterPerformance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        double sum=0;
        int min=a[0];
        int max=a[0];
        int count=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(a[i]>max){max=a[i];}
            if(a[i]<min){min=a[i];}
            if(a[i]>300){count++;}
        }
        double avg=sum/n;
        double target=(double)(n-count)/n*100.0;
        System.out.println("Total Calls: "+n);
        System.out.printf("Average Handling Time: %.2f seconds\n",avg);
        System.out.println("Shortest Call: "+min+" seconds");
        System.out.println("Longest Call: "+max+" seconds");
        System.out.printf("Calls Exceeding Target(300s): %d\n",count);
        System.out.printf("Target Compilance: %.2f%%\n",target);
        sc.close();
    }
}
 