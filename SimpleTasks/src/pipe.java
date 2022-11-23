import java.sql.Array;
import java.util.Arrays;

public class pipe {
    public static int[] pipeFix(int[] numbers) {


        int min=numbers[0];
        int max=numbers[numbers.length-1];

        int size=max-min+1;
        int []arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i]=i+min;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = { 1,9};
        System.out.println(Arrays.toString(pipeFix(arr)));

    }
}
