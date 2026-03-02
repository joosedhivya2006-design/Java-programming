import java.util.Scanner;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int tcount=0;
        double baseprice=0;
        double discount=0;
        double sticket=0;
        double originaltotal=0;
        double finaltotal=0;
        double dsum=0;
        double tdiscount=0;
        for(int i=1;i<=n;i++){
            String seatType=sc.next();
            String customerType=sc.next();
            //seat based price
            if(seatType.equalsIgnoreCase("Regular")){
                baseprice=12.0;
            }
            else if(seatType.equalsIgnoreCase("Premium")){
                baseprice=18.0;
            }
            else if(seatType.equalsIgnoreCase("Recliner")){
                baseprice=25.0;
            }
            //customer discount
            if(customerType.equalsIgnoreCase("Adult")){
                discount=0;
            }
            else if(customerType.equalsIgnoreCase("Child")){
                discount=30;
            }
            else if(customerType.equalsIgnoreCase("Senior")){
                discount=25;
            }
            sticket=baseprice*(1-discount/100.0);
            originaltotal+=baseprice;
            finaltotal+=sticket;
            tdiscount=originaltotal-finaltotal;
            System.out.println("Base Price: $"+baseprice);
            System.out.println("Discount: "+discount+"%");
            System.out.println("Final Price: $"+sticket);
        }
        System.out.println("Total Tickets: "+n);
        System.out.println("Original Total: $"+originaltotal);
        if(n>=5){
            dsum=finaltotal*(10/100.0);
            System.out.println("Total Discount: $"+dsum);
            System.out.println("Final Total: $"+(finaltotal-dsum));
            System.out.println("Group Discount Applied: Yes");
        }
        else{
            System.out.printf("Total Discount: $%.1f\n",tdiscount);
            System.out.println("Final Total: $"+finaltotal);
            System.out.println("Group Discount Applied: No");
        }
        sc.close();
    }
}
