import java.util.Arrays;

public class regex2 {

    public static void main(String[] args) {

        String a="Hello43231there12323hey123123asad2331";
       String[]words= a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b="Hello43231there12323hey123123asa";
        String modifiedString=b.replaceAll("\\d+","-");
        String modifiedString1=b.replaceFirst("\\d","-");
        System.out.println(modifiedString);
        System.out.println(modifiedString1);
    }

}
