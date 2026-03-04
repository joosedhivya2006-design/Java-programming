import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Number: "+n);
        int sum=0;
        while(n!=0){
            int ld=n%10;
            sum+=ld;
            n/=10;
        }
        System.out.println("Sum of digits: "+sum);
        sc.close();
    }
}
