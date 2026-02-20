import java.util.Scanner;

public class RealEstatePropertyValuation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String locationTier=sc.next();
        int sqf=sc.nextInt();
        int propAge=sc.nextInt();
        int amenityScore=sc.nextInt();
        double basePrice=0;
        double adjustment=0;
        double adjustedValue=0;
        double amenityBonus=0;
        double baseValue=0;
        double finalValue=0;
        String Category=" ";
        if(locationTier.equalsIgnoreCase("Prime")){
            basePrice=400;
            if(propAge>=0 && propAge<=5){
                adjustment=0;   
            }
            if(propAge>5 && propAge<=15){
                adjustment=-10;  
            }
            if(propAge>15 && propAge<30){
                adjustment=-20;
            }
            if(propAge>30){
                adjustment=-35;
            }
        }
        if(locationTier.equalsIgnoreCase("Urban")){
            basePrice=300;
            if(propAge>=0 && propAge<=5){
                adjustment=0;   
            }
            if(propAge>5 && propAge<=15){
                adjustment=-5;  
            }
            if(propAge>15 && propAge<30){
                adjustment=-20;
            }
            if(propAge>30){
                adjustment=-35;
            }
        }
        if(locationTier.equalsIgnoreCase("Suburban")){
            basePrice=180;
            if(propAge>=0 && propAge<=5){
                adjustment=0;   
            }
            if(propAge>5 && propAge<=15){
                adjustment=-10;  
            }
            if(propAge>15 && propAge<30){
                adjustment=-20;
            }
            if(propAge>30){
                adjustment=-35;
            }
        }
        if(locationTier.equalsIgnoreCase("Rural")){
            basePrice=100;
            if(propAge>=0 && propAge<=5){
                adjustment=0;
            }
            if(propAge>5 && propAge<=15){
                adjustment=-10;;
            }
            if(propAge>15 && propAge<30){
                adjustment=-20;
            }
            if(propAge>30){
                adjustment=-25;
            }
        }
        baseValue=sqf*basePrice;
        adjustedValue=baseValue*(1+(adjustment/100));
        if(amenityScore>=80 &&amenityScore<=100){
            amenityBonus=(baseValue*(0.01));
        }
        if(amenityScore>=60 && amenityScore<80){
            amenityBonus=(baseValue*0.05);
        }
        if(amenityScore>=40 && amenityScore<60){
            amenityBonus=(baseValue*0.02);
        }
        if(amenityScore<40){
            amenityBonus=0;
        }
        finalValue=baseValue-amenityBonus;
        if((locationTier.equalsIgnoreCase("prime")&&propAge<=15)||(locationTier.equalsIgnoreCase("Urban")&&propAge<=15)){
                Category="Hot";
        }
        if(locationTier.equalsIgnoreCase("Suburban")){
            Category="Stable";
        }
        if(locationTier.equalsIgnoreCase("Rural")||propAge>30){
                Category="Slow";
        }
        System.out.println("Location Tier: "+locationTier);
        System.out.println("Square Footage: "+sqf+"sq ft");
        System.out.println("Property Age: "+propAge+" Years");
        System.out.println("Amenity Score: "+amenityScore);
        System.out.println("Base Price Per Sq Ft: $"+basePrice);
        System.out.println("Age Adjustment: "+adjustment+" %");
        System.out.println("Amenity Bonus: $"+amenityBonus);
        System.out.println("Estimated Property Value: $"+finalValue);
        System.out.println("Market Category: "+Category);
        sc.close();
    }
}
