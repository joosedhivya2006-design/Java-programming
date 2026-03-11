import java.util.Scanner;
public class EmployeeSalaryAnalysis{
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]= new double[n];
        double sum=0;
        for (int i=0;i<n;i++){
            a[i]=sc.nextDouble();
            sum+=a[i];
        }
        double avg=sum/n;
        int count=0;
        for(int i=0;i<n;i++){
            if(avg<a[i]){
                count++;
            }
        }
        double per=(double)count/(double)n*100;
        System.out.println("Total Employees: "+n);
        System.out.printf("Average Salary: %.2f\n",avg);
        System.out.println("Employee Above Average: "+count);
        System.out.printf("Percentage: %.2f%%",per);
    }
}
