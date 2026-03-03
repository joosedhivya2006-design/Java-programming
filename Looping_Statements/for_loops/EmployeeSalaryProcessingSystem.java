import java.util.Scanner;
public class EmployeeSalaryProcessingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double increment=0;
        double finalSalary=0;
        double sum=0;
        Scanner sc1=new Scanner(System.in);
        for(int i=1;i<=n;i++){
            String names=sc1.next();
            double baseSalary=sc1.nextDouble();
            int performanceRating=sc1.nextInt();  
            if(performanceRating==5){
                increment=15;
                finalSalary=baseSalary*(1+increment/100);
            }
            if(performanceRating==4){
                increment=10;
                finalSalary=baseSalary*(1+increment/100);
            }
            if(performanceRating==3){
                increment=5;
                finalSalary=baseSalary*(1+increment/100);
            }
            if(performanceRating==2){
                increment=2;
                finalSalary=baseSalary*(1+increment/100);
            }
            if(performanceRating==1){
                increment=0;
                finalSalary=baseSalary*(1+increment/100);
            }
            sum=sum+finalSalary;
            System.out.println("Employee: "+names+" ");
            System.out.println("Base Salary: "+baseSalary+" ");
            System.out.println("Performance Rating: "+performanceRating);
            System.out.println("Increment: "+increment+"%");
            System.out.printf("Final Salary: %.1f\n",finalSalary);
        }
        double avg=sum/n;
        System.out.println();
        System.out.println("Total Employees Processed: "+n);
        System.out.println("Total Payroll: $"+sum);
        System.out.println("Average Salary: $"+avg);
        sc1.close();
        sc.close();
    }
}