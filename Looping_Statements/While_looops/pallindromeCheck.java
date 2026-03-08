import java.util.Scanner;
public class pallindromeCheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n!=0){
            int ld=n%10;
            rev=(rev*10)+ld;
            n/=10;
        }
        if(rev==temp){
            System.out.println(temp+" is a Pallindrome");
        }
        else{
            System.out.println(temp+" not a Pallindrome");
        }
        sc.close();
    }
}
