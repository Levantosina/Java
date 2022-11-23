import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public class howOld {

    public static int howOld(final String herOld) {

        int x = Character.getNumericValue(herOld.charAt(0));
        return x;
    }

    public static void main(String[] args) {
        System.out.println(howOld("5 year5s old"));
        System.out.println(howOld("9 years old"));
        System.out.println(howOld("1 years old"));


    }
}
