import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int fact=1;
        while(n!=0){
            fact*=n;
            n--;
        }
        System.out.println("Factorial of "+temp+" = "+fact);
        sc.close();
    }
}
