import java.util.Scanner;

public class TwoDArray {
    static int[][] arr=new int[3][3];
    static int[][] arr1=new int[3][3];
    static int [][] c=new int[3][3];
    static int sum=0;
    static Scanner in=new Scanner(System.in);


    public static void matrixInput(){
        System.out.println("Enter both the arrays: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=in.nextInt();
            }
        }
    }

    static void matrixMultiply(){
        System.out.println("Multiplication is: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k =0;k<3;k++){
                    sum=sum+arr[i][k]*arr1[k][j];
                }
                c[i][j]=sum;
                sum=0;
            }
        }

    }
    static void matrixOutput(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        matrixInput();
        matrixMultiply();
        matrixOutput();
    }
}
