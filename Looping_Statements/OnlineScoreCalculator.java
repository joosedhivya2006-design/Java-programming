import java.util.Scanner;

public class OnlineScoreCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int score=0;
        int pass=0;
        int fail=0;
        int sum=0;
        int max=0;
        for(int i=1;i<=n;i++){
            String studentName=sc.next();
            int correctAnswers=sc.nextInt();
            int wrongAnswers=sc.nextInt();
            int unattempted=sc.nextInt();
            String result="";
            score=(correctAnswers*4)-(wrongAnswers*3)+(unattempted*0);
            if(score>=32){
                pass++;
                result="Pass";
            }
            else{
                fail++;
                result="Fail";
            }
            if(max<score){
                max=score;
            }
            sum+=score;
            System.out.println("Student: "+studentName);
            System.out.println("Correct: "+correctAnswers);
            System.out.println("Wrong: "+wrongAnswers);
            System.out.println("Unattempted: "+unattempted);
            System.out.println("Score: "+score);
            System.out.println("Result: "+result);
        }
        System.out.println("Total Students: "+n);
        System.out.println("Pass Count: "+pass);
        System.out.println("Fail Count: "+fail);
        System.out.println("Class Average: "+(double)(sum/n));
        System.out.println("Highest Score: "+max);
        sc.close();
    }
}
