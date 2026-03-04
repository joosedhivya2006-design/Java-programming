import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        double pow=1;
        int sum=0;
        while (n!=0) {
            int ld=n%10;
            count++;
            int i=0;
            while(count>i){
                pow*=ld;
                i++;}
            n/=10;
            sum+=pow;
        }
       if(sum==temp){
            System.out.println(temp+" is an Armstrong number");
        }
        else{
            System.out.println(temp+" is not an Armstrong number");
        }
        sc.close();
    }
}
