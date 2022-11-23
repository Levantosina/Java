import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class hash {




    private static HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

    private static int calls = 0;

    public static int betweenFunctionCalls(int number) {
        calls++;
        if (hashMap.containsKey(number)) {
            int lastCall = hashMap.get(number); // previous call
            hashMap.replace(number, calls);
            return calls - lastCall -1;
        }
        else {
            hashMap.put(number, calls);
            return -1;
        }
    }





    public static String test = "3Zd";
    public static int[] c = new int[test.length()];

    public static void hashTable() {

        for (int i = 0; i < test.length(); i++) {
            String sub = test.substring(i, i+1);
            c[i] = sub.hashCode();
        }
    }

    public static void main(String[] args) {


//        System.out.println(betweenFunctionCalls(1)); // returns -1
//        System.out.println(betweenFunctionCalls(2)); // returns -1
//        System.out.println(betweenFunctionCalls(3)); // returns -1
//        System.out.println(betweenFunctionCalls(1)); // returns 2
//        System.out.println(betweenFunctionCalls(2)); // returns 2
//        System.out.println(betweenFunctionCalls(1)); // returns 1
//        System.out.println(betweenFunctionCalls(1)); // returns 0


        hashTable();

        int h = 0;
        int A = 3;
        int N = 931663099;
        for (int i = 0; i < test.length();i++) {
            h = (h * A +c[i]) % N;
        }
        System.out.println(h);


//            HashSet<Integer> group = new HashSet<Integer>();
//            group.add(33);
//            group.add(2);
//            System.out.println(group.toString());
//            group.remove(33);
//            System.out.println(group.toString());
//            group.add(2);
//            group.add(2);
//            group.add(2);
//            group.add(3);
//            System.out.println(group.toString());
//            if (group.contains(3))
//                System.out.println("3 is there");
//            else
//                System.out.println("3 is not there");
//            group.size();

//            HashMap<String, String> dict = new HashMap<String, String>();
//            dict.put("cat", "meow");
//            dict.put("dog", "woof");
//            dict.put("mouse", "squeeck");
//            System.out.println(dict.toString());
//            System.out.println(dict.get("cat"));
//            dict.containsKey("horse"); // false
//            dict.containsValue("blob"); // false
//            System.out.println(dict.values());
//            System.out.println(dict.keySet());
//
//            String cat = "meow";
//            System.out.println(cat.hashCode());
//            String dog = "woof";
//            System.out.println(dog.hashCode());
//            String mouse = "squeeck";
//            System.out.println(mouse.hashCode());
//
//            String superword = "super";
//            System.out.println(superword.hashCode());


//        elements = []
//        for i = 0 to n-1
//        elements.add(table[i])
//        print(elements.size())

        //    HashSet<Integer> group = new HashSet<Integer>();





        }
}
