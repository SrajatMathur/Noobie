import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        int num;
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        if (num%2==0) {
            System.out.println("Number is even");
        }
        else System.out.println("Number is odd");
        }
    }

