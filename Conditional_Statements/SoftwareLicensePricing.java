import java.util.Scanner;
public class SoftwareLicensePricing{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int usercount=sc.nextInt();
    String licence=sc.next();
    String supportlev=sc.next();
    int contyr=sc.nextInt();

    double baseprice=0.0;
    if(licence.equals("Standard")){
        baseprice=60.0;
    }
    else if(licence.equals("Professional")){
        baseprice=120.0;
    }
    else if(licence.equals("Enterprise")){
        baseprice=200.0;
    }

    //volume discount
    int voldis=0;
    if(usercount>=1 && usercount<=50){
        voldis=0;
    }
    else if(usercount>=51 && usercount<=200){
        voldis=15;
    }
    else if(usercount>=201 && usercount<=500){
        voldis=20;
    }
    else if(usercount>=501 && usercount<=1000){
        voldis=25;
    }
    else if(usercount>=1001){
        voldis=35;
    }

    //suport fees
    double supfees=0.0;
    if(supportlev.equals("Basic")){
        supfees=10.0;
    }
    else if(supportlev.equals("Priority")){
        supfees=30.0;
    }
    else if(supportlev.equals("Premium")){
        supfees=80.0;
    }
    //multi discount
    int multidis=0;
    if(contyr==1){
        multidis=0;
    }
    else if(contyr==2){
        multidis=5;
    }
    else if(contyr==3){
        multidis=10;
    }
    else if(contyr==5){
        multidis=20;
    }
    double discount=baseprice*(1-(voldis/100.0));
    double annual=(discount+supfees)*(1-(multidis/100.0));
    double totannual=annual*usercount;
    double conval=totannual*contyr;

    String ptier="";
    if(usercount<200){
        ptier="Small Business";
    }
    else if( usercount>200 && usercount<=1000){
        ptier="Mid-Market";
    }
    else if(usercount>1000){
        ptier="Enterprise";
    }

    System.out.println("User Count:"+usercount);
    System.out.println("License Type: "+licence);
    System.out.println("Support Level: "+supportlev);
    System.out.println("Contract Duration: "+contyr+" Year");
    System.out.println("Base Price Per User: $"+baseprice);
    System.out.println("Volume Discount:"+voldis +"%");
    System.out.println("Support Fee Per User: $"+supfees);
    System.out.println("Multi-Year Discount: "+multidis+"%");
    System.out.printf("Annual Cost Per User: $%.2f \n",annual);
    System.out.printf("Total Annual Cost: $%.2f \n",totannual);
    System.out.printf("Total Contract Value: $%.2f \n",conval);
    System.out.println("Pricing Tier:"+ptier);
sc.close();
   } 
}
