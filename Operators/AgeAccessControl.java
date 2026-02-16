import java.util.Scanner;
public class AgeAccessControl {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    int idProof=sc.nextInt();
    if(age>=18){
        if(idProof==1){
        System.out.println("Entry Allowed");
        }
        if(idProof==0){
            System.out.println("Entry Denied");
        }
    }
    else if(age<18){
        System.out.println("Entry Denied");
    }
    sc.close();
}

}
