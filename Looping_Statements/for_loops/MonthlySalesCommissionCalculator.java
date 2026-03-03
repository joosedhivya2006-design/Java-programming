import java.util.Scanner;
public class MonthlySalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int percent=0;
        double bonus=0;
        double ssum=0;
        double csum=0;
        double max=0;
        String top="";
        double total=0;
        for(int i=1;i<=n;i++){
            String repName=sc.next();
            double salesAmount=sc.nextDouble();
            if(salesAmount>=0 && salesAmount<=40000){
                percent=5;
            }
            else if(salesAmount>40000 && salesAmount<=80000){
                percent=8;
            }
            else if(salesAmount>80000 && salesAmount<100000){
                percent=10;
            }
            else if(salesAmount>100000 && salesAmount<150000){
                percent=12;
            }
            else if(salesAmount>150000){
                percent=15;
            }
            if(salesAmount>max){
                max=salesAmount;
                top=repName;
            }
            double comission=salesAmount*(percent/100.0);
            System.out.println("Sales Rep: "+repName);
            System.out.println("Sales Amount: $"+salesAmount);
            System.out.println("Comission Rate: "+percent);
            System.out.println("Comission Earned: $"+comission);
            if(salesAmount>=100000){
                bonus=2000;
            }
            if(salesAmount>=150000){
                bonus=3000;
            }
            total=comission+bonus;
            System.out.println("Bonus: $"+bonus);
            System.out.println("Total Payout: $"+total);
            ssum=ssum+salesAmount;
            csum=csum+comission;
        }
        System.out.println();
        System.out.println("Total Sales Rep: "+n);
        System.out.println("Total Sales: "+ssum);
        System.out.println("Total Comissions: "+csum);
        System.out.println("Top Performer: "+top);
        sc.close();
    }
}
