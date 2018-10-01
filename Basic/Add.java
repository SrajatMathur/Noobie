import java.io.BufferedReader;
import java.util.Scanner;

public class Add {
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= in.nextInt();
        System.out.print("Enter second number: ");
        int b= in.nextInt();
        int c=a+b;
        System.out.println("Sum is: "+c);
    }
}
