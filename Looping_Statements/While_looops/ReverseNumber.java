import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Original: "+n);
        int rev=0;
        while (n!=0) {
            int ld=n%10;
            rev=(rev*10)+ld;
            n/=10;
        }
        System.out.println("Reversed: "+rev);
        sc.close();
    }
}
