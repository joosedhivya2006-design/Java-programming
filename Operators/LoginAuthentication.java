import java.util.Scanner;
public class LoginAuthentication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userMatch=sc.nextInt();
        int passwordMatch=sc.nextInt();
        int accountLocked=sc.nextInt();
        if(userMatch==1 && passwordMatch==1){
            if(accountLocked==0){
            System.out.println("Success");}
            else if(accountLocked==1){
                System.out.println("Failed");
            }
        }
        else if((userMatch==1 &&passwordMatch==0)||(userMatch==0 && passwordMatch==1)){
            System.out.println("Failed");
        }
        else{
            System.out.println("Invalid Input Enter (0/1");
        }
        sc.close();
    }
}
