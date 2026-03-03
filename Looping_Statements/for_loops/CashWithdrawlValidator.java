import java.util.Scanner;

public class CashWithdrawlValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double initBalance=sc.nextDouble();
        double current=0;
        int success=0;
        int failure=0;
        String status="";
        double sum=0;
        String reason="";
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            double withdrawl=sc.nextDouble();
            if(withdrawl<=current){
                current=initBalance-withdrawl;
                status="Approved";
                success++;
                sum=sum+withdrawl;
            }
            else{
                status="Denied";
                reason="Insufficient funds";
                current=initBalance;
                failure++;
            }
            System.out.printf("Transaction %d: $%.1f\n",i,withdrawl);
            if(status.equalsIgnoreCase("Approved"))
            System.out.println("Status: "+status);
            else {
            System.out.println("Status: "+status);
            System.out.println("Reason: "+reason);}
            System.out.println("Remaining Balance: "+current);
            System.out.println();
        }
        System.out.println("Total Transactions: "+n);
        System.out.println("Sucessful Withdrawls: "+success);
        System.out.println("Failed Withdrawls: "+failure);
        System.out.println("Final Balance: $"+current);
        System.out.println("Total Withdrawn: $"+sum);
        sc.close();
    }
}
