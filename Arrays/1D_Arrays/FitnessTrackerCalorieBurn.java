import java.util.Scanner;

public class FitnessTrackerCalorieBurn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        double sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int t=sc.nextInt();
        double avg=sum/n;
        int max=a[0];
        int index=0;
        int count=0;
        for(int i =0;i<n;i++){
            if(max<a[i]){
                max=a[i];
                index=i+1;
            }
            if(a[i]<t){
                count++;
            }
        }
        double p=(double)(n-count)/n*100.0;
        System.out.println("Days Tracked: "+n);
        System.out.println("Total Calories Burned: "+(int)sum);
        System.out.printf("Average Calories Burn: %.2f\n",avg);
        System.out.printf("Peak Burn Day: Day %d (%d calories)\n",index,max);
        System.out.println("Days Below Target: "+count);
        System.out.printf("Goal Achievement: %.2f%%\n",p);
        sc.close();
    }
}
