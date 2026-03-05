import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Collatz sequence starting from: "+n);
        int count=0;
        do{
            System.out.print(n+" ");
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;
            }
            count++;
            if(n==1){
                break;
            }
        }while(n>0);
        System.out.println();
        System.out.println("Steps: "+count);
        sc.close();
    }
}
