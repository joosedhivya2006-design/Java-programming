import java.util.Scanner;

public class SumCalculatorUntilZero {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int input;
    int sum=0;
    int count=0;
    while (true){
        if(sc.hasNextInt()){
            input=sc.nextInt();
            sum+=input;
            System.out.println("Enter number (0 to stop): "+input);
            if(input!=0){count++;}
            if(input==0)break;
        }
    }
    sc.close();
    System.out.println("Total sum: "+sum);
    System.out.println("Count: "+count);
   } 
}
