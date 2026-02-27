import java.util.Scanner;
public class OrderPriority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ordertype=sc.next();
        String loyalty=sc.next();
        double orderval=sc.nextDouble();
        String timeslot=sc.next();

        int dis=0;
        if(loyalty.equals("Gold")){
            dis=15;
        }
        else if(loyalty.equals("Silver")){
            dis=10;
        }
        else if(loyalty.equals("Bronze")){
            dis=5;
        }
        else if(loyalty.equals("None")){
            dis=0;
        }

        int adjustment=0;
        if(timeslot.equals("Late-Night")){
            adjustment=-5;
        }
        double servicefee=0;
        if(ordertype.equals("Delivery")){
            servicefee=(orderval*10)/100;

        }
        else if(ordertype.equals("Takeout")){
            servicefee=(orderval*3)/100;
        }
        else if(ordertype.equals("Dine-In")){
            servicefee=(orderval*0)/100;
        }
        dis=dis+adjustment;
        double disval=orderval*(1-(dis/100));
        double finalamt=disval+servicefee;

    String priority=" ";
    if(timeslot.equals("Peak") && ordertype.equals("Delivery")){
        priority="High";
    }
    else if(timeslot.equals("Regular")){
        priority="Medium";
    }
    else if(timeslot.equals("Late-Night")){
        priority="Low";
    }

    System.out.println("Order Type: "+ordertype);
    System.out.println("Loyalty Status: "+loyalty);
    System.out.println("Order Value: "+orderval);
    System.out.println("Time Slot: "+timeslot);
    System.out.println("Base Discount: "+dis);
    System.out.println("Time-Based Adjustment: "+adjustment);
    System.out.println("Service Fee: "+servicefee);
    System.out.println("Final Amount: "+finalamt);
    System.out.println("Kitchen Priority: "+priority);
    System.out.println("Estimated Prep Time: ");
    sc.close();
    }
}