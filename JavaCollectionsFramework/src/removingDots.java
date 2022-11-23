public class removingDots {


    public static void main(String[] args) {

String str="one.two.three";

        System.out.println(replaceDots(str));
    }

    public static String replaceDots( String str) {



        return str.replace(".", "-");

    }
}
