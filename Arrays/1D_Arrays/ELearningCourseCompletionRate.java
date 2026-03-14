import java.util.Scanner;

public class ELearningCourseCompletionRate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        double sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        double avg=sum/n;
        int max=a[0];
        int min=a[0];
        int count=0;
        int ind=0;
        int ind1=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){max=a[i];ind=i+1;}
            if(a[i]<min){min=a[i];ind1=i+1;}
            if(a[i]<60)count++;
        }
        double s=(double)(n-count)/n*100.0;
        System.out.println("Total Students: "+n);
        System.out.printf("Average Completion: %.2f%%\n",avg);
        System.out.println("Highest Completion: "+max+"%(Student "+ind+")");
        System.out.println("Lowest Completion: "+min+"%(Student "+ind1+")");
        System.out.println("At-Risk Students (<60%): "+count);
        System.out.printf("Success Rate: %.2f%%",s);
        sc.close();
    }   
}
