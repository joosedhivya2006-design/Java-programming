import java.util.Scanner;
import java.math.*;
public class BoxCapcityDoubling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int baseBoxes=sc.nextInt();
        int levels=sc.nextInt();
        double capacity=baseBoxes*(Math.pow(2, levels));
        System.out.printf("%d",(int)capacity);
        sc.close();
    }
}
