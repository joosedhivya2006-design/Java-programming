import java.util.Scanner;

public class GradeSheetMatrixGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        double sum=0;
        System.out.println("Grade Sheet:");
        System.out.print("Student ");
        for(int i=1;i<=s;i++){
            System.out.print("Sub"+i+" ");
        }
        System.out.print("Average");
        System.out.println();
        for(int i=1;i<=n;i++){
            String name=sc.next();
            System.out.print(name+" ");
            double avg=0;
            for(int j=1;j<=s;j++){
                double mark=sc.nextInt();
                System.out.print((int)mark+" ");
                sum+=mark;
            }
            System.out.print(avg+" ");
            avg=sum/s;
            System.out.printf("%.2f",avg);
        }
        sc.close();
    }
}
