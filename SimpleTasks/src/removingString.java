public class removingString {
    public static String noSpace(String x) {

        String s =x.replaceAll("\\s","");
        x=s;

        return x;
    }

    public static void main(String[] args) {


        String h="Adsd dsad daasd";
        System.out.println(noSpace(h));
    }
}
