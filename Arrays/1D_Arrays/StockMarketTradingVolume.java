import java.util.Scanner;

public class StockMarketTradingVolume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        double sum=0;
        int max=a[0];
        int index=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(a[i]>max){max=a[i];index=i+1;}
        }
        double avg=sum/n;
        int count=0;
        int indx=0;
        for(int i=0;i<n;i++){
            if(a[i]>1.5*avg){
                count++;
            }
        }
        System.out.println();
        System.out.println("Trading Days Analyzed: "+n);
        System.out.printf("Total Volume: %.2f\n",sum);
        System.out.printf("Average Daily Volume: Day %d (%.2f)\n",index,avg);
        System.out.println("Peak Volume Day: "+max);
        System.out.println("High Volume Days(>150%avg): "+count);
        System.out.print("Breakout Signal Days: [");
        for(int i=0;i<n;i++){
            if(a[i]>1.5*avg){
                indx=i+1;
                if(indx<n-1){System.out.print(indx+", ");}
                else{System.out.print(indx);}
            }
        }
        System.out.print("]");
        sc.close();
    }
}
