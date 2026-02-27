import java.util.Scanner;
public class EnergyManagementSystem {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String day=sc.next();
    double power=sc.nextDouble();
    double percentage=sc.nextDouble();
    String tier =sc.next(); 

    double baserate=0.0;

    if(tier.equals("Basic")){
        baserate=0.18;
    }
    else if(tier.equals("Time-of-Use")){
        baserate=0.15;
    }
     else if(tier.equals("Premium-Green")){
        baserate=0.12;
    }
    double ratemultiplier=0.0;
    if(day.equals("Peak")){
        if(power>percentage){
            ratemultiplier=1.5;
        }
        else{
            ratemultiplier=1.8;
        }
    }
    else if(day.equals("Off-Peak")){
        if(power>percentage){
            ratemultiplier=0.8;
        }
        else{
            ratemultiplier=1.0;
        }
    }
    else if(day.equals("Super-Off-Peak")){
        if(power>percentage){
            ratemultiplier=0.5;
        }
        else{
            ratemultiplier=0.6;
        }
    }
double credit=(power*(percentage/100))*baserate;
double cost=(power*baserate*ratemultiplier)-credit;

String reco=" ";
if(day.equals("Peak")&& percentage<50){
    reco="Shift to Off-Peak";
}
if(day.equals("Basic")|| percentage>50){
    reco="Upgrade to Time-of-Use";
}
else if(percentage>=50){
    reco="Excellent! Continue";
}
else if(day.equals("Off-Peak")&& percentage<50){
    reco="Good timing! Consider increasing renewable capacity";
}
double saving=0.0;
double ratemultiplier1=0.0;
if(day.equals("Peak")){
    if(power>percentage){
            ratemultiplier1=0.8;
        }
        else{
            ratemultiplier1=1.0;
        }
    saving=(power*baserate*ratemultiplier1)-credit;
}
else if(day.equals("Off-Peak")){
    if(power>percentage){
            ratemultiplier1=1.5;
        }
        else{
            ratemultiplier1=1.8;
        }
    saving=(power*baserate*ratemultiplier1)-credit;
}
System.out.println("Time of Day: "+day);
System.out.println("Power Consumption: "+power +"kWh");
System.out.println("Renewable Energy:"+percentage +"%");
System.out.println("Rate Tier:"+tier);
System.out.println("Base Rate: $"+baserate+"/kWh");
System.out.println("Rate Multiplier: "+ratemultiplier+"x");
System.out.println("Renewable Credit: $"+credit);
System.out.printf("Total Cost: $%.2f \n",cost);
System.out.println("Optimization Recommendation:"+reco);
System.out.printf("Potential Savings: $%.2f \n",saving);
sc.close();
}
}