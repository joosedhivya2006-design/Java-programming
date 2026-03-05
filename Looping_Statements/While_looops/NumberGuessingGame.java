import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int secret=sc.nextInt();
        int attempts=0;
        while(true){
            int guess=sc.nextInt();
            ++attempts;
            if(guess!=secret){
                System.out.println("Guess the Number(1100): "+guess);
                if(guess>secret){
                    System.out.println("Too high!");
                }
                else if(guess<secret){
                    System.out.println("Too low!");
                }
            }
            else{
                System.out.println("Correct!");
                break;
            }
        }
        System.out.println("Attempts: "+attempts);
        sc.close();
    }
}
