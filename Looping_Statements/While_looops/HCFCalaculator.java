import java.util.Scanner;

public class HCFCalaculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int temp1=a,temp2=b;
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println("HCF of "+temp1+" and "+temp2+" = "+a);
        sc.close();
    }
}
