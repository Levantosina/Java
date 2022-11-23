import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class hashtable {
    public static void main(String[] args) {
//        Hashtable hashtable=new Hashtable();
//
//       hashtable.put(1,"abc");
//      hashtable.put("blabla","test");
//
//
//       Enumeration elements= hashtable.elements();
//       Enumeration keys=hashtable.keys();
//
//       while (elements.hasMoreElements()&&keys.hasMoreElements()){
//           System.out.println("Object valur is: "+elements.nextElement());
//           System.out.println("Keys value is: "+keys.nextElement());
//       }
//       System.out.println(hashtable.replace(1,"cba"));
//        System.out.println(hashtable.get(1));
//
//        HashMap map=new HashMap();
//        map.put(1,"abc");
//        map.put(2,"test");
//
//        System.out.println(map.getOrDefault("1","sdsd"));
        Hashtable hashtable=new Hashtable();
        int []counter={1,2,3,4,4,5,5,5,5,6,7};
        int biggest=0;
        for (int i = 0; i < counter.length-1; i++) {
            if(counter[i]>biggest)
                biggest=counter[i];
                int mostcommon=i;
            System.out.println(mostcommon);

        }

    }
}
