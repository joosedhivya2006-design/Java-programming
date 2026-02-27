import java.util.Scanner;
public class CourseRegistrationFeeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String status=sc.next();
        int credit=sc.nextInt();
        String ptype=sc.next();
        String res=sc.next();
        double base=0.0;
        if(ptype.equals("Undergraduate")){
            base=350.0;
        }
        else if(ptype.equals("Graduate")){
            base=550.0;
        }
        else if(ptype.equals("Professional")){
            base=800.0;
        }
        //multiplier
        double Multiplier=0.0;
        if(res.equals("In-State")){
            Multiplier=1.0;
        }
        else if(res.equals("Out-of-State")){
            Multiplier=2.5;
        }
        else if(res.equals("International")){
            Multiplier=3.0;
        }
        //fees
        double fee=0.0;
        double activity=0.0;
        if(status.equals("Full-Time")){
            if(ptype.equals("Undergraduate")){
            fee=500.0;
        }
        else if(ptype.equals("Graduate")){
            fee=750.0;
        }
        else if(ptype.equals("Professional")){
            fee=1200.0;
        }
        activity=200.0;
        }
        else if(status.equals("Part-Time")){
            if(ptype.equals("Undergraduate")){
            fee=300.0;
        }
        else if(ptype.equals("Graduate")){
            fee=750.0;
        }
        else if(ptype.equals("Professional")){
            fee=900.0;
        }
        activity=100.0;
        }
        else if(status.equals("Continuing-Education")){
            fee=150.0;
            activity=50.0;
        }

        double cost=credit*base*Multiplier;
        double totalfee=cost+fee+activity;

        String category=" ";
        if(res.equals("In-State")){
            category="Standard";
        }
        else if(status.equals("Continuing-Education ")){
            category="Reduced";
        }
        else if(res.equals("Out-of-State")||res.equals("International")){
            category="premium";
        }
        System.out.println("Student Status: "+status);
        System.out.println("Credit Hours: "+credit);
        System.out.println("Program Type:  "+ptype);
        System.out.println("Residency: "+res);
        System.out.println("Base Tuition Per Credit: "+base);
        System.out.println("Residency Multiplier: "+Multiplier);
        System.out.println("Program Fee: "+fee);
        System.out.println("Student Activity Fee: "+activity);
        System.out.println("Total Registration Fee: "+totalfee);
        System.out.println("Fee Category: "+category);
        sc.close();
    }
}