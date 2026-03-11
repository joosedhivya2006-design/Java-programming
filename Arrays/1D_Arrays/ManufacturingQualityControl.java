import java.util.Scanner;
public class ManufacturingQualityControl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxD=sc.nextInt();
        int count=0;
        int a[]=new int[n];
        int res[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>=maxD){
                count++;
                res[index++]=i;
            }
        }
        System.out.println("Production Lines: "+n);
        System.out.println("Acceptable Threshold: "+maxD);
        System.out.print("Critical Lines: [");
        for(int i=0;i<index;i++){
            if(i<index-1)
                System.out.print(res[i]+", ");
            else
                System.out.print(res[i]);
        }
        System.out.print("]");
    }
}
