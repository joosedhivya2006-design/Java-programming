import java.util.Scanner;

public class BloodDonationCampEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String eligible="";
        int count=0;
        String reason="";
        for(int i=1;i<=n;i++){
        String donorName=sc.next();
        int age=sc.nextInt();
        double weight=sc.nextDouble();
        double hemoglobin=sc.nextDouble();
        if((age>=18 && age<=65)&&(weight>=50)&&(hemoglobin>=12.5)){
            eligible="Eligible";
            count++;
        }
        else{
            eligible="Not Eligible";
            if(age<18){
                reason="Reason: Age Below 18 years";
            }
            else if(age<65){
                reason="Reason: Age above 65 years";
            }
            if(hemoglobin<12.5){
                reason="Reason: Hemoglobin Below 12.5 g/dL";
            }
            if(weight<50){
                reason="Reason: Weight Below 50 kg";
            }
        }
        System.out.println("Donor: "+donorName);
        System.out.println("Age: "+age);
        System.out.println("Weight: "+weight+"kg");
        System.out.println("Hemoglobin: "+hemoglobin+" g/dL");
        if(eligible.equalsIgnoreCase("Not Eligible")){
            System.out.println("Status: "+eligible);
            System.out.println("Reason: "+reason);}
        else{
            System.out.println("Status: "+eligible);
        }
        }
        System.out.println("Total Donors: "+n);
        System.out.println("Eligible Rate: "+count);
        System.out.println("Rejected Donors: "+(n-count));
        System.out.println("Eligibility Rate: "+((count/n)*100.0)+"%");
        sc.close();
    }
}
