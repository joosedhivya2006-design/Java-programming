import java.util.Scanner;

public class SeatingArrangement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int total;
        System.out.println("Seating Arrangement: ");
        for(int i=1;i<=r;i++){
            System.out.print("Row "+i+": ");
            for(int j=1;j<=c;j++){
                System.out.print("Seat-"+j+" ");
            }
            System.out.println();
        }
        total=r*c;
        System.out.println("Total Seats: "+total);
        sc.close();
    }
}
