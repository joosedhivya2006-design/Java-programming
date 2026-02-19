import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Loyalty Tier (Bronze, Silver, Gold, Platinum): ");
        String loyaltyTier = scanner.next();
        System.out.print("Enter Cart Value: ");
        double cartValue = scanner.nextDouble();
        System.out.print("Enter Category (Electronics, Fashion, Books, Groceries): ");
        String category = scanner.next();
        System.out.print("Enter Membership Type (Prime, Regular): ");
        String membershipType = scanner.next();
        double baseDiscount = 0;
        double additionalDiscount = 0;
        double categoryBonus = 0;
        if (loyaltyTier.equalsIgnoreCase("Bronze")) {
            baseDiscount = 5;
        } else if (loyaltyTier.equalsIgnoreCase("Silver")) {
            baseDiscount = 8;
        } else if (loyaltyTier.equalsIgnoreCase("Gold")) {
            baseDiscount = 12;
        } else if (loyaltyTier.equalsIgnoreCase("Platinum")) {
            baseDiscount = 15;
        }

        if (cartValue >= 500) {
            if (cartValue <= 999) {
                additionalDiscount = 3;
            } else if (cartValue <= 1999) {
                additionalDiscount = 5;
            } else {
                additionalDiscount = 7;
            }
        }
        if (category.equalsIgnoreCase("Electronics")) {
            if (membershipType.equalsIgnoreCase("Prime")) categoryBonus = 5;
        } else if (category.equalsIgnoreCase("Fashion")) {
            categoryBonus = 3;
        } else if (category.equalsIgnoreCase("Books")) {
            if (membershipType.equalsIgnoreCase("Prime")) categoryBonus = 5;
        } else if (category.equalsIgnoreCase("Groceries")) {
            if (cartValue > 300) categoryBonus = 2;
        }
        double totalDiscountPercent = baseDiscount + additionalDiscount + categoryBonus;
        double finalPrice = cartValue * (1 - (totalDiscountPercent / 100));
        double savings = cartValue - finalPrice;
        System.out.println("Loyalty Tier: "+loyaltyTier);
        System.out.println("Cart Value: "+cartValue);
        System.out.println("Product Category: "+category);
        System.out.println("Membership: "+membershipType);
        System.out.println("Base Discount: "+baseDiscount);
        System.out.println("Additional Discount: "+additionalDiscount);
        System.out.println("Total Discount: " + totalDiscountPercent + "%");
        System.out.printf("Final Price: $%.2f%n", finalPrice);
        System.out.printf("Total Savings: $%.2f%n", savings);

        scanner.close();
    }
}