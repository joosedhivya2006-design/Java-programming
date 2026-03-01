import java.util.Scanner;
public class RoomOccupancyTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String status="";
        double sum=0.0;
        int count=0;
        double max=0;
        int currentDay=0;
        for(int i=1;i<=n;i++){
            int days=sc.nextInt();
            int roomsOccupied=sc.nextInt();
            int totalRooms=sc.nextInt();
            double occupancyRate=(roomsOccupied/totalRooms)*100;
            if(occupancyRate<=60){
                status="Low";
            }
            else if(occupancyRate>60 && occupancyRate<80){
                status="Moderate";
            }
            else if(occupancyRate>=80 &&occupancyRate<100){
                status="High";
            }
            else if(occupancyRate==100){
                status="Full";
                count++;
            }
            if(max<occupancyRate){
                max=occupancyRate;
                currentDay=days;
            }
            System.out.println("Day: "+days);
            System.out.println("Rooms Occupied: "+roomsOccupied);
            System.out.println("Total Rooms: "+totalRooms);
            System.out.println("Occupancy Rate: "+occupancyRate);
            System.out.println("Status: "+status);
            System.out.println();
            sum=sum+occupancyRate;
        }
        double avg=sum/n;
        System.out.println("Total Days Analyzed: "+n);
        System.out.println("Average Occupancy Rate: "+avg+"%");
        System.out.println("Peak Occupancy Day: "+currentDay);
        System.out.println("Days at Full Capacity: "+count);
        sc.close();
    }
}

