import java.util.Scanner;
public class MovieTicketPricingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Movie=sc.next();
        String stym=sc.next();
        String seatcat=sc.next();
        String custyp=sc.next();

        double basetic=12.0;

        // format surcharge
        double fcharge=0.0;
        if(Movie.equals("2D")){
            fcharge=0.0;
        }
        else if(Movie.equals("3D")){
            fcharge=5.0;
        }
        else if(Movie.equals("lMAX")){
            fcharge=8.0;
        }
        else if(Movie.equals("4DX")){
            fcharge=10.0;
        }
        //upgrade
        double upgrade=0.0;
        if(seatcat.equals("Standard")){
            upgrade=0.0;
        }
        else if(seatcat.equals("Premium")){
            upgrade=4.0;
        }
        else if(seatcat.equals("Recliner")){
            upgrade=7.0;
        }
        //tadjust
        int tadjust=0;
        if(stym.equals("Matinee")){
            tadjust=-30;
        }
        else if(stym.equals("Evening")){
            tadjust=0;
        }
        else if(stym.equals("Prime-Time")){
            tadjust=20;
        }
        else if(stym.equals("Late-Night")){
            tadjust=-20;
        }

        int dis=0;
        if(custyp.equals("Adult")){
            dis=0;
        }
        else if(custyp.equals("Senior")){
            dis=25;
        }
        else if(custyp.equals("Student")){
            dis=15;
        }
        else if(custyp.equals("Child")){
            dis=30;
        }
        double bsur=basetic+fcharge+upgrade;
        double aprice=bsur*(1+(tadjust/100.0));
        double fprice=aprice*(1-(dis/100.0));

        String Voucher="Yes";
        if(custyp.equals("Adult")){
            Voucher="No";
        }
        else{
            Voucher="Yes";
        }
        String cat=" ";
        if(fprice<20){
            cat="Value";
        }
        else if(fprice>=20 && fprice<30){
            cat="Premium";
        }
        else{
            cat="Luxury";
        }

        System.out.println("Movie Format: "+Movie);
        System.out.println("Show Time: "+stym);
        System.out.println("Seat Category: "+seatcat);
        System.out.println("Customer Type: "+custyp);
        System.out.println("Base Ticket Price: $"+basetic);
        System.out.println("Format Surcharge: $"+fcharge);
        System.out.println("Seat Upgrade Fee: $"+upgrade);
        System.out.println("Time-Based Adjustment: "+tadjust+"%");
        System.out.println("Customer Discount: "+dis+"%");
        System.out.printf("Final Ticket Price: $%.2f \n",fprice);
        System.out.println("Concession Voucher: "+Voucher);
        System.out.println("Pricing Category: "+cat);
        sc.close();
    }
}