import java.util.Arrays;

public class non_consecutive {
    static Integer find(final int[] array) {

        for(int i=0;i<array.length-1;i++){
            if(array[i+1]!=array[i]+1)
                return array[i+1];
        }
        return null;

    }
    public static void main(String[] args) {
        int[]arr={1, 2, 3, 4, 6, 7, 8};
        System.out.println((find(arr)));

    }
}
