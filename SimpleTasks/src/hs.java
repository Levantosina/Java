import java.util.HashMap;

public class hs {

    private static HashMap<Integer,Integer>hashMap=new HashMap<Integer,Integer>();
    private static int call=0;

    public static int betweenFunctionCalls(int number){
        call++;
        if(hashMap.containsKey(number))
        {
            int lastcall= hashMap.get(number);
            hashMap.replace(number,call);
            return call-lastcall-1;
        }
        else
            hashMap.put(number,call);
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(betweenFunctionCalls(1)); // returns -1
        System.out.println(betweenFunctionCalls(2)); // returns -1
        System.out.println(betweenFunctionCalls(3)); // returns -1
        System.out.println(betweenFunctionCalls(1)); // returns 2
        System.out.println(betweenFunctionCalls(2)); // returns 2
        System.out.println(betweenFunctionCalls(1)); // returns 1
        System.out.println(betweenFunctionCalls(1)); // returns 0
    }
}
