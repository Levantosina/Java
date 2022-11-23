import java.util.Arrays;

public class avrr {

    public static void main(String[] args) {
    int[]arr=new int[]{2,3,4,5,1};
avr(arr);
        System.out.println(avr(arr));

    }



    public  static int avr(int []arr){
        int count=0;
        int result=0;
        int avr=0;
        for (int i = 0; i < arr.length ; i++) {
            result+=arr[i];
            avr=result/arr.length;
            count++;

        }
return avr;

    }
}
