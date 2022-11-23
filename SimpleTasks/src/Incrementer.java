import java.util.Arrays;

public class Incrementer {

    public static void main(String[] args) {

        int[] array = new int[]{4, 6, 7, 7, 3};


       System.out.println(Arrays.toString(incrementer(array)));





//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i % 10);
//        }


    }

    public static int[] incrementer(int[] numbers) {
        int count = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + count;
            numbers[i] =numbers[i]%10;
            count++;
        }
        return numbers;
    }
}
