import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String category="";
        double priceperunit=0;
        double bill=0;
        double sum=0;
        double total=0;
        for(int i=1;i<=n;i++){
            String consumerID=sc.next();
            int unitConsumed=sc.nextInt();
            if(unitConsumed>=0 && unitConsumed<=100){
                priceperunit=0.10;
                category="Low Usage";
            }
            else if(unitConsumed>100 && unitConsumed<=200){
                priceperunit=0.13;
                category="Low Usage";
            }
            else if(unitConsumed>200 && unitConsumed<=300){
                priceperunit=0.16;
                category="Medium Usage";
            }
            else if(unitConsumed>300){
                priceperunit=0.20;
                category="High Usage";
            }
            bill=unitConsumed*priceperunit;
            total+=unitConsumed;
            sum=sum+bill;
            System.out.println("Consumer ID: "+consumerID);
            System.out.println("Units Consumed: "+unitConsumed);
            System.out.printf("Bill Amount: %.1f\n",bill);
            System.out.println("Category: "+category);
        }
        double avg=sum/n;
        System.out.println("Total Consumers: "+n);
        System.out.println("Total Units Consumed: "+total);
        System.out.println("Total Revenue: "+sum);
        System.out.println("Average Bill: "+avg);
        sc.close();
    }
}
