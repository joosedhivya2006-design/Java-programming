import java.util.Scanner;
import java.lang.Math;

public class GradeAnalysisSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pass=0;
        int fail=0;
        double sum=0;
        int max=0;
        for(int i=1;i<=n;i++){
            String names=sc.next();
            int score=sc.nextInt();
            System.out.println("Name: "+names);
            System.out.println("Score: "+score);
            if(score>=60){
                if(score>=85 && score<=100){
                    System.out.println("Grade: A");
                }
                if(score>=70 && score<85){
                    System.out.println("Grade: B");
                }
                if(score>=60 && score<70){
                    System.out.println("Grade: C");
                }
                System.out.println("Status: Pass");
                pass++;
            }
            else{
                if(score>=50 && score<60){
                    System.out.println("Grade: D");
                }
                if(score>=0 && score<50){
                    System.out.println("Grade: F");
                }
                System.out.println("Status: Fail");
                fail++;
            }
            max=Math.max(max,score);
            sum=sum+score;
        }
        double avg=sum/n;
        System.out.println();
        System.out.println("Total Students: "+n);
        System.out.println("Class Average: "+avg);
        System.out.println("Highest Score: "+max);
        System.out.println("Students Passed: "+pass);
        System.out.println("Students Failed: "+fail);
        sc.close();
    }
}
