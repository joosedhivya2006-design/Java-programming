import java.util.Scanner;
public class Evaluation{
   public static void main(String[] args) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter Theory Marks: ");
      int var2 = var1.nextInt();
      System.out.print("Enter Practical Marks: ");
      int var3 = var1.nextInt();
      float avg=(float)(var2+var3)/2;
      if((var2>=0 && var2<=100)&&(var3>=0 && var3<=100)){
      if (var2 >= 50 && var3 >= 50) {
         if(avg>=60){
             System.out.println("Result= PASS");
         }
         else{
            System.out.println("Result= FAIL");
         }
      }
      else{
         System.out.println("Result= FAIL");
      }
   }
      var1.close();
   }  
}
