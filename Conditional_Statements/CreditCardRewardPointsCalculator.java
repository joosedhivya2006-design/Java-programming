import java.util.Scanner;
public class CreditCardRewardPointsCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ctier=sc.next();
        String pcat=sc.next();
        double tamt=sc.nextDouble();
        String pstatus=sc.next();

        double basepoint=1.0;
        
        //catbonus
        double catbonus=0.0;
        if(pcat.equals("Groceries")){
            catbonus=2.0;
        }
        else if(pcat.equals("Dining")){
            catbonus=2.5;
        }
        else if(pcat.equals("Travel")){
            catbonus=3.0;
        }
        else if(pcat.equals("Gas")){
            catbonus=2.0;
        }
        else if(pcat.equals("Other")){
            catbonus=1.0;
        }
        //tier multiplier
        double tmul=0.0;
        if(ctier.equals("Basic")){
            tmul=1.0;
        }
        else if(ctier.equals("Gold")){
            tmul=1.25;
        }
        else if(ctier.equals("Platinum")){
            tmul=1.5;
        }
        else if(ctier.equals("Black")){
            tmul=2.0;
        }
        //promotional multiplier
        double pmul=0.0;
        if(pstatus.equals("None")){
            pmul=1.0;
        }
        else if(pstatus.equals("Double-Points")){
            pmul=2.0;
        }
        else if(pstatus.equals("Triple-Points")){
            pmul=3.0;
        }
        double pearn=tamt*basepoint*catbonus*tmul*pmul;
        double cashval=pearn*(0.01);
        
        String cat=" ";
        if(ctier.equals("Basic")){
            cat="Standard";
        }
        else if(ctier.equals("Gold")){
            cat="Enhanced";
        }
        else if(ctier.equals("Platinum")){
            cat="Premium";
        }
        else if(ctier.equals("Black")){
            cat="Elite";
        }
        System.out.println("Card Tier:"+ctier);
        System.out.println("Purchase Category: "+pcat);
        System.out.println("Transaction Amount: $"+tamt);
        System.out.println("Promotional Status: "+pstatus);
        System.out.println("Base Points Rate: 1.0 points per dollar");
        System.out.println("Category Bonus: "+catbonus+"x");
        System.out.println("Tier Multiplier:"+tmul+"x");
        System.out.println("Promotional Multiplier:"+pmul+"x");
        System.out.println("Points Earned: "+pearn);
        System.out.println("Equivalent Cash Value: $"+cashval);
        System.out.println("Rewards Tier:"+cat);
        sc.close();

    }
}