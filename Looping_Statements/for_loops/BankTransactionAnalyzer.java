import java.util.Scanner;

public class BankTransactionAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String category="";
        double totalD=0;
        double totalW=0;
        double totalT=0;
        double totalP=0;
        double sum=0;
        for(int i=1;i<=n;i++){
            String transactionType=sc.next();
            double amount=sc.nextDouble();
            if(transactionType.equalsIgnoreCase("Deposit")){
                category="Credit";
                totalD+=amount;
            }
            if(transactionType.equalsIgnoreCase("Withdrawl")||transactionType.equalsIgnoreCase("Transfer")||transactionType.equalsIgnoreCase("Payment")){
                category="Debit";
                if(transactionType.equalsIgnoreCase("Withdrawl")){
                    totalW+=amount;
                }
                else if(transactionType.equalsIgnoreCase("Transfer")){
                    totalT+=amount;
                }
                else if(transactionType.equalsIgnoreCase(transactionType)){
                    totalP+=amount;

                }
            }
            sum=totalD-(totalW+totalT+totalP);
            System.out.println("Transaction "+i+": "+transactionType);
            System.out.println("Amount: $"+amount);
            System.out.println("Category: "+category);
        }
        System.out.println("Total Transactions: "+n);
        System.out.println("Total Deposits: $"+totalD);
        System.out.println("Total Withdrawls: $"+totalW);
        System.out.println("Total Transfers: $"+totalT);
        System.out.println("Total Payments: $"+totalP);
        System.out.println("Net Balance Change: $"+sum);
        sc.close();
    }
}
