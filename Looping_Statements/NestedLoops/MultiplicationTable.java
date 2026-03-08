import java.util.Scanner;

public class MultiplicationTable {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    System.out.println("Multiplication Table ("+r+" X "+c+")");
    for(int i=1;i<=c;i++){
        System.out.print(i+" ");
    }
    System.out.println();
    for(int i=1;i<=r;i++){
        System.out.print(i+" ");
        for(int j=1;j<=c;j++){
            System.out.print(i*j+" ");
        }
        System.out.println();
    }
    sc.close();
   } 
}
