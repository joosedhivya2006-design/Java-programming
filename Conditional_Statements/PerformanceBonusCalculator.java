import java.util.Scanner;
public class PerformanceBonusCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        System.out.print("Rating: ");
        int rating=sc.nextInt();
        System.out.print("Years of Service: ");
        int service=sc.nextInt();
        System.out.print("Department Type: ");
        String type=str.next();
        String type1="Critical";
        String type2="Non-Critical";
        System.out.print("Base Salary: ");
        double baseSalary=sc1.nextDouble();
        if(rating<0 || rating>5){
            System.out.println("Invalid");
        }
        System.out.println("Perfeormance Rating: "+rating);
        System.out.println("Years of Service: "+service);
        System.out.println("Department: "+type);
        if(rating>=3 && rating<=5){
            double percent;
            double bonus;
            if(type.equals(type1)){
                if(rating==5 && service>=5){
                    percent=25;
                    System.out.println("Bonus Percentage: "+(int)percent+"%");
                    bonus=baseSalary*(percent/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else if(rating==4 && service>=10){
                    percent=22;
                    System.out.println("Bonus Percentage: "+(int)percent+"%");
                    bonus=baseSalary*(percent/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else if(rating==4 && service<5){
                    percent=15;
                    System.out.println("Bonus Percentage: "+(int)percent+"%");
                    bonus=baseSalary*(percent/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else if(rating==3 && service<10){
                    percent=10;
                    System.out.println("Bonus Percentage: "+(int)percent+"%");
                    bonus=baseSalary*(percent/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else{
                    percent=0;
                    System.out.println("Bonus Percentage: "+(int)percent+"%");
                    bonus=baseSalary*(percent/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
            }
            if(type.equals(type2)){
                if(rating==5){
                    percent=18;
                    System.out.println("Bonus Percentage: "+(int)percent+"%");
                    bonus=baseSalary*(percent/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else if(rating==4){
                    percent=12;
                    System.out.println("Bonus Percentage: "+(int)percent+"%");
                    bonus=baseSalary*(percent/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else if(rating==3){
                    percent=8;
                    System.out.println("Bonus Percentage: "+(int)percent+"%");
                    bonus=baseSalary*(percent/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else{
                    percent=0;
                    System.out.println("Bonus Percentage: "+(int)percent+"%");
                    bonus=baseSalary*(percent/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
            }
            System.out.println("Status: Eligible");
        }
        else{
            System.out.println("Status: Not Eligible");
        }
        sc.close();
        sc1.close();
        str.close();
    }
}

