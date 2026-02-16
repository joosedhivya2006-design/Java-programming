import java.util.Scanner;
public class DataCompressionSizeReduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fileSize=sc.nextInt();
        int compressionCycles=sc.nextInt();
        int Compressed=fileSize>>compressionCycles;
        System.out.println(Compressed);
        sc.close();
    }
}
