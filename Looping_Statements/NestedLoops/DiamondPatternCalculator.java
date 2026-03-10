import java.util.Scanner;

public class DiamondPatternCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=2*n-i;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=n-1;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

