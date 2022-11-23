import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashMap {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();

//        map.put(1,"One");
//        map.put(2,"two");
//        map.put(3,"three");
//
//        for(Map.Entry<Integer,String>entry:map.entrySet()){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }


       Map<Integer,String>hashMap=new HashMap<>();
       Map<Integer,String >linkedHashMap=new LinkedHashMap<>();
       Map<Integer,String>treeMap=new TreeMap<>();

       //testMap(hashMap);

     //  testMap(linkedHashMap);

       testMap(treeMap);

    }

    public static void testMap(Map<Integer,String> map){
        map.put(39,"Bob");
        map.put(31,"Mike");
        map.put(88,"Bek");
        map.put(21,"Keck");
        map.put(0,"Tim");
        map.put(2031,"Her");
        map.put(6,"Bob");

        for (Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
