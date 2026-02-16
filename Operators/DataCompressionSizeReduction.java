import java.util.Scanner;
import java.math.*;
public class DataCompressionSizeReduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fileSize=sc.nextInt();
        int compressionCycles=sc.nextInt();
        double Compressed=fileSize/Math.pow(2, compressionCycles);
        System.out.printf("%d",(int)Compressed);
        sc.close();
    }
}
