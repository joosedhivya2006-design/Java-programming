import java.util.Scanner;
public class Scholarship_eligibility {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int p=sc.nextInt();
        if(i<20000 && p>=75){
            System.out.println("Granted");
        }
        else{
            System.out.println("Not Granted");
        }
        sc.close();
    }
}
