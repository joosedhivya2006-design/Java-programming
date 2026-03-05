import java.util.Scanner;

public class btd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Binary: "+n);
        int count=0;
        int res=0;
        while(n!=0){
            int ld=n%10;
            count++;
            int i=1;
            while(i<count){
                ld*=2;
                i++;
            }
            n/=10;
            res+=ld;
        }
        System.out.println("Decimal: "+res);
        sc.close();
    }
}
