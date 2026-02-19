import java.util.Scanner;

public class PremiumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Is the person a smoker? (Smoker/Non-Smoker): ");
        String smokerInput = scanner.next();
        System.out.print("Any pre-existing conditions? (yes/no): ");
        String conditionInput = scanner.next();
        System.out.print("Enter Coverage Tier (Basic, Standard, Premium): ");
        String tier = scanner.next();
        double basePremium = 0;
        if (age >= 18 && age <= 30) {
            if (tier.equalsIgnoreCase("Basic")) basePremium = 200;
            else if (tier.equalsIgnoreCase("Standard")) basePremium = 300;
            else if (tier.equalsIgnoreCase("Premium")) basePremium = 500;
        } 
        else if (age >= 31 && age <= 50) {
            if (tier.equalsIgnoreCase("Basic")) basePremium = 250;
            else if (tier.equalsIgnoreCase("Standard")) basePremium = 350;
            else if (tier.equalsIgnoreCase("Premium")) basePremium = 600;
        } 
        else if (age >= 51 && age <= 65) { 
            if (tier.equalsIgnoreCase("Basic")) basePremium = 350;
            else if (tier.equalsIgnoreCase("Standard")) basePremium = 450;
            else if (tier.equalsIgnoreCase("Premium")) basePremium = 700;
        } 
        else if (age >= 66) {
            if (tier.equalsIgnoreCase("Basic")) basePremium = 400;
            else if (tier.equalsIgnoreCase("Standard")) basePremium = 550;
            else if (tier.equalsIgnoreCase("Premium")) basePremium = 800;
        }
        double surchargeRate = 0;
        boolean isSmoker = smokerInput.equalsIgnoreCase("Smoker");
        boolean hasCondition = conditionInput.equalsIgnoreCase("yes");

        if (isSmoker && hasCondition) {
            surchargeRate = 0.70;
        } else if (isSmoker) {
            surchargeRate = 0.40;
        } else if (hasCondition) {
            surchargeRate = 0.30;
        }

        double riskSurcharge = basePremium * surchargeRate;
        double totalPremium = basePremium + riskSurcharge;
        System.out.println("Age: "+age);
        System.out.println("Smoking Status: "+smokerInput);
        System.out.println("Pre-existing Conditions: "+conditionInput);
        System.out.println("Coverage: Tier: "+tier);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Risk Surcharge: $" + riskSurcharge);
        System.out.println("Total Monthly Premium: $" + totalPremium);

        scanner.close();
    }
}