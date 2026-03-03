import java.util.Scanner;

public class MembershipRenewalTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double renewalFee=0;
        int discount=0;
        String priority="";
        double fee=0;
        int count=0;
        double total=0;
        for(int i=1;i<=n;i++){
            String memberName=sc.next();
            String membershipType=sc.next();
            int daysUntilExpiry=sc.nextInt();
            if(membershipType.equalsIgnoreCase("Basic")){
                renewalFee=50;
            }
            else if(membershipType.equalsIgnoreCase("Premium")){
                renewalFee=100;
            }
            else if(membershipType.equalsIgnoreCase("VIP")){
                renewalFee=200;
            }
            if(daysUntilExpiry>=45){
                discount=20;
            }
            else if(daysUntilExpiry>=30 && daysUntilExpiry<45){
                discount=15;
            }
            else if(daysUntilExpiry>=15 && daysUntilExpiry<30){
                discount=10;
            }
            else if(daysUntilExpiry<15){
                discount=0;
            }
            if(daysUntilExpiry<10){
                priority="Urgent";
                count++;
            }
            else if(daysUntilExpiry>=10 && daysUntilExpiry<=30){
                priority="High";
            }
            else if(daysUntilExpiry>30){
                priority="Normal";
            }
            fee=renewalFee*(1-(double)discount/100.0);
            total+=fee;
            System.out.println("Member: "+memberName);
            System.out.println("Membership: "+membershipType);
            System.out.println("Days Until Expiry: "+daysUntilExpiry);
            System.out.println("Renewal Fee: $"+renewalFee);
            System.out.println("Discount: "+discount+"%");
            System.out.println("Final Fee: $"+fee);
            System.out.println("Priority: "+priority);
        }
        System.out.println("Total Members: "+n);
        System.out.println("Urgent Renewals: "+count);
        System.out.println("Total Renewal Revenue: $"+total);
        System.out.println("Average Renewal Fee: $"+(double)(total/n));
        sc.close();
    }
}
