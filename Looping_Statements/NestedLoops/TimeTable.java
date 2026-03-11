import java.util.Scanner;

class TimeTable{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int Days = sc.nextInt();
        int Periods = sc.nextInt();

        String [] Day = {"Monday","Tuesday","Wednesday","Thursad","Friday","Saturday","Sunday"};
        String [][]Period = new String[Days][Periods];

        for(int i=0;i<Days;i++){
            for(int j=0;j<Periods;j++){
                Period[i][j] = sc.next();
            }
        }

        System.out.println();
        System.out.println("Class Time Table: ");
        System.out.print("Day ");
        for(int i=1;i<=Periods;i++){
            System.out.print("Period"+i+" ");
        }

        System.out.println();

        for(int i=0;i<Days;i++){
            System.out.print(Day[i] + " ");
            for(int j=0;j<Periods;j++){
                System.out.print(Period[i][j] + " ");
            }
            System.out.println();
        }
    }
}
