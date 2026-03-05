import java.util.Scanner;
public class GCDCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int temp1=a,temp2=b;
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD of "+temp1+" and "+temp2+" = "+a);
        sc.close();
    }
}
