import java.util.Scanner;

public class SocialMediaEngagementRate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        double sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
            sum+=a[i];
        }
        double avg=sum/n;
        double t=avg*2.0;
        double max=a[0];
        double min=a[0];
        int count=0;
        int ind=0;
        int ind1=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){max=a[i];ind=i+1;}
            if(a[i]<min){min=a[i];ind1=i+1;}
            if(a[i]>t){count++;}
        }
        System.out.println("Total Posts: "+n);
        System.out.printf("Average Engagement: %.2f%%\n",avg);
        System.out.printf("Peak Engagement: %.2f%% (Post ind)\n",max,ind);
        System.out.printf("Lowest Engagement: %.2f%% (Post %d)\n",min,ind1);
        System.out.println("Viral Posts (>200% avg): "+count);
        System.out.printf("viral Threshold: %.2f%%\n",t);
        System.out.print("Top Performers: [");
        for(int i=0;i<n;i++){
            if(a[i]>t){int index=i+1;
                System.out.print(index+" ");
            }
        }
        System.out.print("]");
        sc.close();
    }
}
