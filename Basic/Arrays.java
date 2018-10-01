import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        int[] arr=new int[10];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array: ");
        for(int i=0;i<10;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}