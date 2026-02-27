import java.util.Scanner;
public class ShippingCostAndDeliveryTimeCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pacwt=sc.nextDouble();
        String deszone=sc.next();
        String shipspeed=sc.next();
        String pacsize=sc.next();

        double baserate=0.0;
        if(shipspeed.equals("Economy")){
            baserate=5.0;
        }
        else if(shipspeed.equals("Standard")){
            baserate=10.0;
        }
        else if(shipspeed.equals("Express")){
            baserate=25.0;
        }
        else if(shipspeed.equals("Overnight")){
            baserate=50.0;
        }
        double wtsurage=0.0;
        if(pacwt<40){
         wtsurage=1.0*pacwt;
        }
        else{
           wtsurage=2.0*pacwt;  
        }

        //zone multiplier
        double zmul=0.0;

        if(deszone.equals("Local")){
            zmul=1.0;
        }
        else if(deszone.equals("Regional")){
            zmul=1.2;
        }
        else if(deszone.equals("National")){
            zmul=1.5;
        }
        else if(deszone.equals("International")){
            zmul=3.0;
        }
        //size surcharge
        double ss=0.0;
        if(pacsize.equals("Small")){
            ss=0.0;
        }
        else if(pacsize.equals("Medium")){
            ss=5.0;
        }
        else if(pacsize.equals("Large")){
            ss=15.0;
        }
        else if(pacsize.equals("Small")){
            ss=30.0;
        }
        
        double basecost =(baserate+wtsurage)*zmul;
        double totcost=basecost+ss;

            String deltym=" ";
        if(shipspeed.equals("Economy")){
            if(deszone.equals("Local")){
                deltym="3-5";
            }
            else if(deszone.equals("Regional")){
                deltym="5-7";
            }
            else if(deszone.equals("National")){
                deltym="7-10";
            }
            else if(deszone.equals("National")){
                deltym="14-21";
            }
        }
        else if(shipspeed.equals("Standard")){
            if(deszone.equals("Local")){
                deltym="2-3";
            }
            else if(deszone.equals("Regional")){
                deltym="3-5";
            }
            else if(deszone.equals("National")){
                deltym="5-7";
            }
            else if(deszone.equals("National")){
                deltym="10-14";
            }
        }
        else if(shipspeed.equals("Express")){
            if(deszone.equals("Local")){
                deltym="1";
            }
            else if(deszone.equals("Regional")){
                deltym="1-2";
            }
            else if(deszone.equals("National")){
                deltym="2-3";
            }
            else if(deszone.equals("National")){
                deltym="3-5";
            }
        }
        else if(shipspeed.equals("Overnight")){
            deltym="1";
        }

        String serlev=" ";
        if(shipspeed.equals("Economy")){
           serlev="Budget";
        }
        else if(shipspeed.equals("Standard")){
            serlev="Standard";
        }
        else if(shipspeed.equals("Express")){
           serlev="Priority";
        }
        else if(shipspeed.equals("Overnight")){
            serlev="Premium";
        }


        System.out.println("Package Weight: "+pacwt);
        System.out.println("Destination Zone: "+deszone);
        System.out.println("Shipping Speed: "+shipspeed);
        System.out.println("Package Size: "+pacsize);
        System.out.println("Base Shipping Rate: $"+baserate);
        System.out.println("Weight Surcharge: $"+wtsurage);
        System.out.println("Zone Multiplier: "+zmul+"x");
        System.out.println("Size Surcharge: $"+ss);
        System.out.printf("Total Shipping Cost: $%.2f \n",totcost);
        System.out.println("Estimated Delivery: "+deltym);
        System.out.println("Service Level: "+serlev);
        sc.close();
    }
}