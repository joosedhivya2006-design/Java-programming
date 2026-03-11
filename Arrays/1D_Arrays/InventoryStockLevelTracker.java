import java.util.Scanner;

public class InventoryStockLevelTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        int index=0;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(a[i]<t){
                res[index++]=i;
                count++;
            }
        }
        System.out.println("Total Products: "+n);
        System.out.println("Minimum Threshold: "+t);
        System.out.println("Low Stock Products: "+count);
        System.out.print("Product Indices: [");
        for(int i=0;i<index;i++){
            if(i<index-1)
            {System.out.print(res[i]+", ");}
            else{
                System.out.print(res[i]);
            }
        }
        System.out.print("]");
    }
}