import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class testing1_2_3 {
    public static void main(String[] args) {

        List<String>list1=new ArrayList<>();
        number(list1);
        list1.stream().forEach(a-> System.out.print(a));

    }

    public static List<String> number(List<String> lines) {

        for (int i = 1; i <28; i++) {
            lines.add("'"+i+":"+(char)(i+96)+"'"+",");
        }
        return null;
    }

}
