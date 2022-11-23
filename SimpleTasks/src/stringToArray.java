import java.util.Arrays;

public class stringToArray {
   public static String[] stringToArray(String s) {
       String[] rijeci = s.split("\\W+");
       return rijeci;
   }
    public static void main(String[] args) {


       String s="bla bla";
       System.out.println(stringToArray(s));

//        String []arr ={"hello", "world","this", "is", "great"};
//        String s=Arrays.toString(arr);
//        //String str=s.replace(',',' ');
//        System.out.print(stringToArray(s));

    }
}

