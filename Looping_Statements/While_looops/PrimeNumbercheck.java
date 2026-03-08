import java.util.Scanner;

public class PrimeNumbercheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        int count=0;
        boolean isPrime=false;
        while (i<=n) {
            if(n%i==0){
                isPrime=true;
                count++;
                if(count>2){
                    isPrime=false;
                }
            }
            i++;
        }
        if(isPrime==true){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" is not prime");
        }
        sc.close();
    }
}
