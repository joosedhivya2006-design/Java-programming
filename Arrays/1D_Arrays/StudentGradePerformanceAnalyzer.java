import java.util.Scanner;
public class StudentGradePerformanceAnalyzer {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       } 
       int count=0;
       int max=a[0];
       int min=a[0];
       int fc=0;
       double pass=0;
       for(int i=0;i<n;i++){
        if(a[i]>max){
            max=a[i];
        }
        if(a[i]<min){
            min=a[i];
        }
        if(a[i]<40){
            fc++;
        }
       }
       pass=(double)(n-fc)/(double)n*100;
       System.out.println("Total Students: "+n);
       System.out.println("Highest Score: "+max);
       System.out.println("Lowest Score: "+min);
       System.out.println("Failed Students: "+fc);
       System.out.printf("Pass Percentage: %.2f%%\n",pass);
    }
}
