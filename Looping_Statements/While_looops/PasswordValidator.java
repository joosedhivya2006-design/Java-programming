import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String correctPassword=sc.next();
        int maxAttempt=3;
        int attempts=0;
        boolean loggin=false;
        while(attempts<=3 && !loggin ){
            System.out.println("Enter Password");
            String input=sc.next();
            attempts++;
            if(!input.equals(correctPassword)){
                if(maxAttempt-1>0){
                System.out.println("Incorrect! Attempts remaining: "+(maxAttempt-1));
                }
            }
            else if(input.equals(correctPassword)){
                System.out.println("Access granted!");
                break;
            }
            if(attempts>maxAttempt){
                System.out.println("Account Locked!");
                break;
            }
            maxAttempt--;
        }
        sc.close();
    }
}
