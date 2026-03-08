import java.util.Scanner;

public class SumofEvenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt(),e=sc.nextInt();
        int sum=0;
        while(s<=e){
            if(s%2==0){
                sum+=s;
            }
            s++;
        }
        System.out.println("Sum of even numbers from "+s+" to "+e+": "+sum);
        sc.close();
    }
}
