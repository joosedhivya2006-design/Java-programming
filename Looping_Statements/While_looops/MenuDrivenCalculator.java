import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Exit");
        int choice=0;
        do{
            System.out.print("Choice: ");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Two numbers: ");
                    int a=sc.nextInt(),b=sc.nextInt();
                    System.out.println("Result: "+(a+b));
                    break;
                    
                case 2:
                    System.out.println("Enter Two numbers: ");
                    a=sc.nextInt();b=sc.nextInt();
                    System.out.println("Result: "+(a-b));
                    break;
                    
                case 3:
                    System.out.println("Enter Two numbers: ");
                    a=sc.nextInt();b=sc.nextInt();
                    System.out.println("Result: "+(a*b));
                    break;
                case 4:
                    System.out.print("Enter Two numbers: ");
                    a=sc.nextInt();b=sc.nextInt();
                    if(b!=0)
                        System.out.println("Result: "+((double)a/(double)b));
                    else{
                        System.out.println("Cannot be divided");
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Choice.Try again(1-5)");
                    break;
                }
        }while(choice!=5);
        sc.close();
    }
}
