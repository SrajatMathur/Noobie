import java.util.Scanner;

public class CircleRadius {
    int r;
    public static void main(String[] args){
        System.out.println("Enter the radius");
        Scanner in =new Scanner(System.in);
        float r=in.nextFloat();
        float area= (float) (StrictMath.pow(r,2)*Math.PI);
        System.out.println("Area is: "+area);
    }
}
