import java.util.Scanner;

class ProductPrice{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int Product = sc.nextInt();
        int vendors = sc.nextInt();
        
        String [] Name = new String [Product];
        double [][] Price = new double[Product][vendors];
        
        for(int i=0;i<Product;i++){
            Name[i] = sc.next();
            for(int j=0;j<vendors;j++){
                Price[i][j] = sc.nextDouble();
            }
        }
        
        System.out.println("Price Comparison Matrix: ");
        System.out.print("Product ");
        for(int i=1;i<=vendors;i++){
            System.out.print("Vendor"+i+" ");
        }
        System.out.print("BestPrice");
        System.out.println();
        for(int i=0;i<Product;i++){
            System.out.print(Name[i] + " ");
            double min = Price [0][0];
            for(int j=0;j<vendors;j++){
                System.out.print(Price[i][j]+" ");
                if(Price[i][j]<min){
                    min = Price[i][j];
                }
            }
            System.out.printf("%.2f%n",min);
            // System.out.println();
        }
        
    }
}
