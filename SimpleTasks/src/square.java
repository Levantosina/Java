public class square {
    public static void main(String[] args) {


        //System.out.println( square(21233553));

        int num =25;
      System.out.println(Math.sqrt(num));

        System.out.println(square(25));

    }

    private static boolean square(long number){
//        double n=Math.sqrt(number);
//        double num= (long)(n*n);
//        if(num==number)
//            return true;
//
//        else if(number<0)
//            return false;
//
//        else
//            return false;

        return Math.sqrt(number) == (int) Math.sqrt(number);
    }
}
