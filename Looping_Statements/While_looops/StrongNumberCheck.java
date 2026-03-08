import java.util.Scanner;

public class StrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            int ld=n%10;
            int i=1;
            int fact=1;
            while(i<=ld){
                fact*=i;
                i++;
            }
            sum+=fact;
            n/=10;
        }
        if(sum==temp){
        System.out.println(temp+" is a Strong number");
        }
        else{
            System.out.println(temp+" is a not Strong number");
        }
        sc.close();
    }
}
