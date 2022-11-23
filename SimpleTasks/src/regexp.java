public class regexp {
    public static void main(String[] args) {
       /*
       \\d-one number

       \\w-one character
      \\d+ -1 or more
       \\d* - 0 or more
       \\d?-0 or 1 sign before

       (x|y|z) - one string of many strings

       [a-Az-Z]
       [0-9]-\\d

       [^abc] кроме

       . - любой символ


       {2} -2 signs before
       {2,} 2 or more signs
       {2,4} - from 2 to 4 signs
        */



        String a="-1232";
        String b="4321";
        String c="+12345";
        System.out.println(c.matches("(\\+|-)?\\d+"));


        String d="dasdsad123553";
        System.out.println(d.matches("[a-zA-Z21]\\d+"));

        String e="helalo";

        System.out.println(e.matches("[^abc]*"));

        String url="http://www.google.com";
        String url1="http://www.yandex.ru";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url1.matches("http://www\\..+\\.(com|ru)"));

    String f="1";
        System.out.println(f.matches("\\d{2,}"));

    }
}
