import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str = 0;
        str = Integer.parseInt(sc.next());




            if (str >= 1 && str <= 4)
                System.out.println("small");
            else if (str >= 5 && str <= 5)
                System.out.println("middle");
            else if (str >= 9) {
                System.out.println("big");
            } else if (str < 1)
                System.out.println("error");


    }
}