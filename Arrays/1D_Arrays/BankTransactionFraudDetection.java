import java.util.Scanner;
public class BankTransactionFraudDetection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
        }
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        double avg=sum/n;
        double t=avg*2;
        int count=0;
        int index=0;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(a[i]>t){
                count++;
                res[index++]=i;
            }
        }
        System.out.println("Total Transactions: "+n);
        System.out.printf("Average Transactions: $%.2f\n",avg);
        System.out.println("Suspicious Transaction: "+count);
        System.out.print("Fraud Alert Indices: [");
        for(int i=0;i<index;i++){
            if(i<index-1){System.out.print(res[i]+", ");}
            else{System.out.print(res[i]);}
        }
        System.out.print("]");
    }
}
