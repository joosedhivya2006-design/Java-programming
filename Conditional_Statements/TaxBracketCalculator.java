import java.util.Scanner;
public class TaxBracketCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double annualrevenue=sc.nextDouble();
        String Bussinesstype=sc.next();
        double expenses=sc.nextDouble();
        double taxCredits=sc.nextDouble();
        double taxableincome=annualrevenue-expenses;
        int taxrate=0;
        if(Bussinesstype.equals("C-Corp")){
            if(taxableincome<=500000){
                 taxrate=21;
            }
            else if(taxableincome<=1000000){
                taxrate=24;
            }
            else if(taxableincome<=2000000){
                taxrate=28;
            }
            else if(taxableincome>2000000){
                taxrate=30;
            }
        }
        else if(Bussinesstype.equals("S-Corp")){
            if(taxableincome<=500000){
                 taxrate=20;
            }
            else if(taxableincome<=1000000){
                taxrate=25;
            }
            else if(taxableincome>2000000){
                taxrate=28;
            }
            
        }
        else if(Bussinesstype.equals("LLC")){
            if(taxableincome<=200000){
                 taxrate=15;
            }
            else if(taxableincome<=500000){
                taxrate=18;
            }
            else if(taxableincome>500000){
                taxrate=22;
            }    
        }
        if(Bussinesstype.equals("Partnership")){
            if(taxableincome<=300000){
                 taxrate=18;
            }
            else if(taxableincome<=800000){
                taxrate=22;
            }
            else if(taxableincome>800000){
                taxrate=26;
            }    
        }
        double grosstax=(taxableincome*taxrate)/100;
        double nettax=grosstax-taxCredits;
        double effectiverate=(nettax/annualrevenue)*100;

        System.out.println("Annual Revenue: $"+annualrevenue);
        System.out.println("Business Type: "+Bussinesstype);
        System.out.println("Deductible Expenses: $"+expenses);
        System.out.println("Tax Credits: $"+taxCredits);
        System.out.println("Taxable Income: $"+taxableincome);
        System.out.println("Tax Rate: "+taxrate+"%");
        System.out.println("Gross Tax: $"+grosstax);
        System.out.println("Net Tax After Credits: $"+nettax);
        System.out.printf("Effective Tax Rate:%.2f%% ",effectiverate);   
        sc.close();
    }
}