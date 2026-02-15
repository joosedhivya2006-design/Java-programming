import java.util.Scanner;
public class GymTrainerSalary{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int baseSalary=sc.nextInt();
int sessions=sc.nextInt();
int payPerSession=sc.nextInt();
int bonus=sc.nextInt();
int maintenanceFee=sc.nextInt();
int finalSalary=baseSalary+(sessions*payPerSession)+bonus-maintenanceFee;
System.out.println("Final Salary = "+finalSalary);
sc.close();
}
}
