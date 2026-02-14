import java.util.Scanner;
public class Withdrawl_eligibility {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int w=sc.nextInt();
        int d=sc.nextInt();
        if(w<=b && w<=d){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
        sc.close();
    }
}
