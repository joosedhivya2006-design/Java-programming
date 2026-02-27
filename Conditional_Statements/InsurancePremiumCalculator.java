import java.util.Scanner;
public class InsurancePremiumCalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String vehicletype=sc.next();
        String drivingrec=sc.next();
        String coverage=sc.next();

        double base=0.0;
        if(coverage.equals("Basic")){
            base=500.0;
        }
        else if(coverage.equals("Standard")){
            base=800.0;
        }
        else if(coverage.equals("Comprehensive")){
            base=1500.0;
        }
        double agefact=0.0;
        if(age>16 && age<=21){
            agefact=1.8;
        }
        else if(age<=25){
            agefact=1.5;
        }
        else if(age<=40){
            agefact=1.0;
        }
        else if(age<=60){
            agefact=0.9;
        }
        else if(age>=61){
            agefact=1.1;
        }
        double risk=0.0;
        if(vehicletype.equals("Sedan")){
            risk=1.0;
        }
        else if(vehicletype.equals("SUV")){
            risk=1.2;
        }
        else if(vehicletype.equals("Sports")){
            risk=1.5;
        }
        if(vehicletype.equals("Truck")){
            risk=1.1;
        }
        int adjustment=0;
        if(drivingrec.equals("Clean")){
            adjustment=-10;
        }
        else if(drivingrec.equals("Minor-Violations")){
            adjustment=25;
        }
        else if(drivingrec.equals("Major-Violations")){
            adjustment=50;
        }
        double premium=base*agefact*risk;
        double fpremium=premium*(1+(adjustment/100));
        double mpremium=fpremium/12;
        String category=" ";
        if(agefact==1.8){
            category="Very High";
        }
        else if(agefact==1.5){
            category="High";
        }
        else if(agefact==1.0 || agefact==0.9){
            category="Low";
        }
        else{
            category="Medium";
        }
    System.out.println("Driver Age: "+age);
    System.out.println("Vehicle Type: "+vehicletype);
    System.out.println("Driving Record: "+drivingrec);
    System.out.println("Coverage Level: "+coverage);
    System.out.println("Base Premium: $"+base);
    System.out.println("Age Factor: "+agefact+"x");
    System.out.println("Vehicle Risk Factor: "+risk+"x");
    System.out.println("Record Adjustment: "+adjustment);
    System.out.printf("Monthly Premium: $%.2f \n",mpremium);
    System.out.printf("Annual Premium: $%.2f \n",fpremium);
    System.out.println("Risk Category: "+category);
        sc.close();

    }
}