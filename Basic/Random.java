public class Random {
    public static void main(String[] args){
        int[] arr= new int[10];
        for(int i=0;i<10;i++){
            System.out.println((int) (Math.floor(1000)*Math.random()));
            arr[i]=(int) (Math.floor(1000)*Math.random());
        }
        for(int i=0;i<10;i++){
            System.out.println("Output is; "+arr[i]);
        }
    }
}