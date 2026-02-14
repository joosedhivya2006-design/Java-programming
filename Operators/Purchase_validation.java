import java.util.Scanner;
public class Purchase_validation {
   public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(b==0 || b==1){
    if(a<=l && b==0){
        System.out.println("Approved");
    }
    else if(a>=l || b==1){
        System.out.println("Declined");
    }
    sc.close();
   } 
    }
}
