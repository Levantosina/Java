import java.util.Arrays;

public class SentenceSmash {

        public static String[] stringToArray(String s) {


            String str=s.replace(","," ");

           String[]string= {str};

            for (int i = 0; i <string.length ; i++) {


            }

            return string;

        }
        public static void main(String[] args) {

           String[]str=new String[]{"Bilal", "Djaghout"};
           String s = Arrays.toString(str);

           System.out.print(stringToArray(s));

        }


    }

