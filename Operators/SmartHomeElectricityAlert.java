import java.util.Scanner;
public class SmartHomeElectricityAlert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int UnitsConsumed=sc.nextInt();
        int VoltageFluctuation=sc.nextInt();
        if(UnitsConsumed>500){
            System.out.println("Alert");
        }
        else if(UnitsConsumed<=500){
            if(VoltageFluctuation==0){
            System.out.println("Normal");}
            else if(VoltageFluctuation==1){
                System.out.println("Alert");
            }
        }
        sc.close();
    }
}
