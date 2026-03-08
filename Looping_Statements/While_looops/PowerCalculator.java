import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        int temp=exponent;
        int pow=1;
        while(exponent>0){
            pow=pow*base;
            exponent--;
        }
        System.out.println(base+"^"+temp+" = "+pow);
        sc.close();
    }
}
