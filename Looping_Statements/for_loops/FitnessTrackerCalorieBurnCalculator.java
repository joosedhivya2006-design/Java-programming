import java.util.Scanner;

public class FitnessTrackerCalorieBurnCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double cburn=0;
        String intensity="";
        double durationsum=0;
        double cburncum=0;
        for(int i=1;i<=n;i++){
            String exerciseType=sc.next();
            int durationMinutes=sc.nextInt();
            if(exerciseType.equalsIgnoreCase("Running")){
                cburn=10*durationMinutes;
                intensity="High";
            }
            else if(exerciseType.equalsIgnoreCase("Swimming")){
                cburn=12*durationMinutes;
                intensity="High";
            }
            else if(exerciseType.equalsIgnoreCase("Cycling")){
                cburn=8*durationMinutes;
                intensity="Moderate";
            }
            else if(exerciseType.equalsIgnoreCase("Gym")){
                cburn=7*durationMinutes;
                intensity="Moderate";
            }
            else if(exerciseType.equalsIgnoreCase("Walking")){
                cburn=4*durationMinutes;
                intensity="Low";
            }
            durationsum+=durationMinutes;
            cburncum+=cburn;
            System.out.println("Session "+i+": "+exerciseType);
            System.out.println("Duration: "+durationMinutes+" minutes");
            System.out.println("Calories Burned: "+cburn);
            System.out.println("Intensity: "+intensity);
        }  
        double avg=cburncum/n; 
        System.out.println("Total Workouts: "+n);
        System.out.println("Total Duration: "+durationsum);
        System.out.println("Total Calories Burned: "+cburncum);
        System.out.println("Average Calories per Session: "+avg);
        String level="";
        if(cburncum<300){
            level="Beginner";
        }
        else if(cburncum>=300 &&cburncum<=1000){
            level="Intermediate";
        }
        else if(cburncum>1000){
            level="Advanced";
        }
        System.out.println("Fitness Level: "+level);
        sc.close();
    }
}
