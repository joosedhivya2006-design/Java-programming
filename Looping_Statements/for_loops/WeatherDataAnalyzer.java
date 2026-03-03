import java.util.Scanner;

public class WeatherDataAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String status="";
        double high=0;
        double low=0;
        double sum=0;
        int hot=0;
        int cold=0;
        int hour=0;
        int currenthour1=0;
        int currenthour2=0;
        for(int i=1;i<=n;i++){
            hour=sc.nextInt();
            double temp=sc.nextDouble();
            if(temp>40 || temp<=0){
                status="Extreme";
            }
            else if(temp>=32 && temp<=40){
                status="Hot";
            }
            else if(temp>=0 && temp<=10){
                status="Cold";
            }
            else if(temp>10 && temp<32){
                status="Normal";
            }
            if(temp>high){
                high=temp;
                currenthour1=hour;
            }
            low=high;
            if(temp<low){
                low=temp;
                currenthour2=hour;
            }
            if(temp>=32) hot++;
            if(temp<=10) cold++;
            sum+=temp;
            System.out.println("Hour "+hour+": "+temp+"C");
            System.out.println("Status: "+status);
            
        }
        System.out.println("Total Readings: "+n);
        System.out.printf("Average Temperature: %.2f\n",(double)(sum/n));
        System.out.println("Highest Temperature: "+high+" at Hour "+currenthour1);
        System.out.println("Lowest Temperature: "+low+" at Hour "+currenthour2);
        System.out.println("Hot Hours: "+hot);
        System.out.println("Cold Hours: "+cold);
        sc.close();
    }
}
