import java.util.Scanner;

public class Factorial {
    static Scanner in= new Scanner(System.in);
    static long getFact(long n) {
        if (n == 0) {
            return 1;
        } else return (n*getFact(n - 1));
    }
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        long n=in.nextLong();
        System.out.println("Factorial is: "+getFact(n));
    }
}
