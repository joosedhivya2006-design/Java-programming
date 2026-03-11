import java.util.Scanner;


class NumberPyramidPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            int n = 1;
            for(int j=2;j<=i;j++){
                System.out.print(Math.abs((n++)-i));
            }
            System.out.println();
        }
    }
}
