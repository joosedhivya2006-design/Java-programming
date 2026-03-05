import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int temp1=a,temp2=b;
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        int lcm=(temp1*temp2)/a;
        System.out.println(lcm);
        sc.close();
    }
}
