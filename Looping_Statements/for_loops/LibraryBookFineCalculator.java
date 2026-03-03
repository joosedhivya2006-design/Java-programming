import java.util.Scanner;

public class LibraryBookFineCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double finaRate=0;
        double fine=0;
        int max_fcap=0;
        double min=0;
        int count=0;
        String capApplied="";
        double sum=0;
        for(int i=1;i<=n;i++){
            String bookType=sc.next();
            int daysLate=sc.nextInt();
            if(bookType.equalsIgnoreCase("Regular")){
                finaRate=0.50;
                max_fcap=10;
            }
            else if(bookType.equalsIgnoreCase("Reference")){
                finaRate=1.00;
                max_fcap=20;
            }
            else if(bookType.equalsIgnoreCase("Magazine")){
                finaRate=0.25;
                max_fcap=5;
            }
            fine=finaRate*daysLate;
            if(fine<max_fcap){
                min=fine;
                capApplied="No";
            }
            else{
                min=max_fcap;
                capApplied="Yes";
            }
            if(daysLate>0){
                count++;
            }
            sum+=min;
            System.out.println("Book "+i+": "+bookType);
            System.out.println("Days Late: "+daysLate);
            System.out.println("Daily Fine: $"+finaRate);
            System.out.println("Calculated Fine: $"+fine);
            System.out.println("Actual Fine: $"+min);
            System.out.println("Cap Applied: "+capApplied);
        }
        System.out.println("Total Books: "+n);
        System.out.println("Total Fines Collected: $"+sum);
        System.out.println("Books Overdue: "+count);
        System.out.println("Average Fine: $"+(double)(sum/n));
        sc.close();
    }
}
