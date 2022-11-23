import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDivisor {

    public static void main(String[] args) {

        findDivisor(12);
    }

    public static void findDivisor(int n) {
        int number = 0;
        List<Integer> arrays= new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                arrays.add(i);
                number++;
        }
        System.out.println(arrays.size());
    }
}





