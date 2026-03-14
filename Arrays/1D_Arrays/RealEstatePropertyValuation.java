import java.util.Scanner;

public class RealEstatePropertyValuation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        double a[]=new double[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
            sum+=a[i];
        }
        double avg=sum/n;
        double max=a[0];
        double min=a[0];
        int ind1=0;
        int ind2=0;
        double t=avg*0.7;
        double p=avg*1.5;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){max=a[i];ind1=i+1;}
            if(a[i]<min){min=a[i];ind2=i+1;}
            if(a[i]<t){count1++;}
            if(a[i]>p){count2++;}
        }
        System.out.println("Total Properties: "+n);
        System.out.println("Portfolio Value: "+sum);
        System.out.printf("Average Property value: %.2f%%\n",avg);
        System.out.printf("Most Valuable: $%.2f (Property %d)\n",max,ind1);
        System.out.printf("Least Valuable: $%.2f (Property %d)\n",min,ind2);
        System.out.println("Bargain Properties (<70% avg): "+count1);
        System.out.println("Premium Properties (>150% avg): "+count2);
        sc.close();
    }
}
