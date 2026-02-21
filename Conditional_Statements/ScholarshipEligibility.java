import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gpa = scanner.nextDouble();
        double familyIncome = scanner.nextDouble();
        int extracurricularScore = scanner.nextInt();
        scanner.nextLine(); 
        String scholarshipType = scanner.nextLine();
        boolean isEligible = false;
        double awardAmount=0;
        String Category="";
        System.out.println("GPA: " + gpa);
        System.out.format("Family Income: $%.2f%n", familyIncome);
        System.out.println("Extracurricular Score: " + extracurricularScore);
        System.out.println("Scholarship Type: " + scholarshipType);
        if (scholarshipType.equalsIgnoreCase("Merit")) {
            if(gpa>=3.8 && extracurricularScore>=80){
                isEligible = true;
                awardAmount=15000;
                Category="Full";
            }
            if (gpa >= 3.5 && (extracurricularScore >= 70 && extracurricularScore<60)) {
                isEligible = true;
                awardAmount=15000;
                Category="Partial";
            }
            if(gpa>3.0 && extracurricularScore>=60){
                isEligible = true;
                awardAmount=8000;
                Category="Minimal";
            }
                
        } else if (scholarshipType.equalsIgnoreCase("Need-Based")) {
            if (familyIncome < 30000 && gpa >= 3.5) {
                isEligible = true;
                awardAmount=30000;
                Category="Full";
            }
            if (familyIncome < 50000 && (gpa >= 3.0 && gpa<3.5)) {
                isEligible = true;
                awardAmount=18000;
                Category="Partial";
            }
            if (familyIncome < 70000 && (gpa >=2.8 && gpa<3.0)) {
                isEligible = true;
                awardAmount=10000;
                Category="Minimal";
            }
        } else if (scholarshipType.equalsIgnoreCase("Sports")) {
            if (extracurricularScore >= 85 && gpa >= 3.0) {
                isEligible = true;
                awardAmount=22000;
                Category="Full";
            }
            if (extracurricularScore >= 75 && gpa >= 2.8) {
                isEligible = true;
                awardAmount=20000;
                Category="Partial";
            }
            if (extracurricularScore >= 65 && gpa >= 2.5) {
                isEligible = true;
                awardAmount=12000;
                Category="Minimal";
            }
        }
        System.out.println("Eligibility: " + (isEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Award Amount: $"+awardAmount);
        System.out.println("Award Category: "+Category);
        scanner.close();
    }

}
