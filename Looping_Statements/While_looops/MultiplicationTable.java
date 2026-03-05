import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int range=sc.nextInt();
        int i=1;
        int prod=1;
        do {
            prod=i*n;
            System.out.println(n+" X "+i+" = "+prod);
            i++;
        }while (i<=range);
        sc.close();
    }
}
