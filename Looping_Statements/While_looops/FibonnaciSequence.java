
import java.util.Scanner;

public class FibonnaciSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        int s=1;
        int i=0;
        while(i<n){
            System.out.print(f+" ");
            int temp=f;
            f=f+s;
            s=temp;
            i++;
        }
        sc.close();
    }
}
