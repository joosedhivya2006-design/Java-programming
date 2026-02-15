import java.util.Scanner;
public class ScholarshipFee{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double tuitionFees=sc.nextDouble();
double scholarship=sc.nextDouble();
double examFee=sc.nextDouble();
double libraryFee=sc.nextDouble();
double scholarshipAmount=tuitionFees*(scholarship/100);
double remainingFee=tuitionFees-scholarshipAmount;
double finalPayable=remainingFee+examFee+libraryFee;
System.out.println("Final Payable Fee = "+finalPayable);
sc.close();
}
}
