import java.util.Scanner;

class MatrixTranspose{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][]arr = new int[row][col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix("+row+" x "+col+"):");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix ("+row+" x "+col+"):");


        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
