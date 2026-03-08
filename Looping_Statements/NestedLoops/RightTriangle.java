import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(s.equalsIgnoreCase("Star")){
                    System.out.print("*");
                }
                else if(s.equalsIgnoreCase("number")){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        sc.close();
        
    }
}
