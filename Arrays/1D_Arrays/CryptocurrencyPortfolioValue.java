import java.util.Scanner;
public class CryptocurrencyPortfolioValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        double b[]=new double[n];
        double res[]=new double[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextDouble();
        }
        res[0]=a[0]*b[0];
        double max=res[0];
        double min=res[0];
        double sum=res[0];
        int indx1=0;
        int indx2=0;
        for(int i=1;i<n;i++){
            res[i]=a[i]*b[i];
            if(res[i]>max){
                max=res[i];
                indx1=i;
            }
            if(res[i]<min){
                min=res[i];
                indx2=i;
            }
            sum+=res[i];
        }
        System.out.println("Number of Assets: "+n);
        System.out.printf("Total Portfolio Value: $%.2f\n",sum);
        System.out.printf("Most Valuable Asset: Asset %d ($%.2f)\n",indx1+1,max);
        System.out.printf("Least Valuable Asset: Asset %d ($%.2f)\n",indx2+1,min);
        sc.close();
    }
}
