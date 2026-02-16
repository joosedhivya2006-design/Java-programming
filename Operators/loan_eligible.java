import java.util.Scanner;
public class loan_eligible{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int cs=sc.nextInt();
        if(s>25000 && cs>700){
            System.out.println("Approved");
        }
        else{
            System.out.println("Rejected");
        }
        sc.close();
    }
}
