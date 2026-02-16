import java.util.Scanner;
public class SportsTournamentPrizeFund{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int registration=sc.nextInt();
int broadcast=sc.nextInt();
int sponsor=sc.nextInt();
int prize=sc.nextInt();
int rent=sc.nextInt();
int advertising=sc.nextInt();
int remaining=registration+broadcast+sponsor-prize-rent-advertising;
System.out.println("Remaining Tournament Fund = "+remaining);
sc.close();
}
}
