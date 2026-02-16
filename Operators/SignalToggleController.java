import java.util.Scanner;

public class SignalToggleController {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int signalValue=sc.nextInt();
        int toggleMask=sc.nextInt();
        System.out.println(signalValue^toggleMask);
        sc.close();
    }
}
