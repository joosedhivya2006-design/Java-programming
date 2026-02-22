import java.util.Scanner;
public class LoanApproval{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        int creditScore=sc.nextInt();
        double income=sc1.nextDouble();
        double debtRatio=sc1.nextDouble();
        String loanType=sc.next();
        String status;
        double loanAmount;
        System.out.println("Credit Score: "+creditScore);
        System.out.println("Annual Income: "+income);
        System.out.println("Debt-to-Income Ratio: "+debtRatio+"%");
        System.out.println("Loan Type: "+loanType);
        if (creditScore >= 750) {
    if (debtRatio <= 30) {
        if (loanType.equals("Home")) {
            status = "Approved";
            loanAmount = 4 * income;
            System.out.println("Decision: "+status);
            System.out.println("Maximum Loan Amount: $"+loanAmount);
        } else if (loanType.equals("Personal")) {
            status = "Approved";
            loanAmount = 1 * income;
            System.out.println("Decision: "+status);
            System.out.println("Maximum Loan Amount: $"+loanAmount);
        } else if (loanType.equals("Business")) {
            status = "Approved";
            loanAmount = 3 * income;
            System.out.println("Decision: "+status);
            System.out.println("Maximum Loan Amount: $"+loanAmount);
        }
    } else if (debtRatio <= 40) { 
        if (loanType.equals("Business")) {
            status = "Approved";
            loanAmount = 3 * income;
            System.out.println("Decision: "+status);
            System.out.println("Maximum Loan Amount: $"+loanAmount);
        }
    }
} else if (creditScore >= 700) {
    if (debtRatio <= 40 && loanType.equals("Home")) { // Moderate debt
        status = "Needs Review";
        loanAmount = 3 * income;
        System.out.println("Decision: "+status);
        System.out.println("Maximum Loan Amount: $"+loanAmount);
    } else if (debtRatio <= 40 && loanType.equals("Business")) {
        status = "Approved";
        loanAmount = 3 * income;
        System.out.println("Decision: "+status);
System.out.println("Maximum Loan Amount: $"+loanAmount);
    }
} else if (creditScore >= 650) {
    if (debtRatio <= 40 && loanType.equals("Personal")) { // Moderate debt
        status = "Needs Review";
        loanAmount = 0.5 * income;
        System.out.println("Decision: "+status);
        System.out.println("Maximum Loan Amount: $"+loanAmount);
    }
}
        sc.close();
        sc1.close();
    }

}
