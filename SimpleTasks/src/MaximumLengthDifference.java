import jdk.nashorn.internal.runtime.PropertyMap;
import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumLengthDifference {

    public static void main(String[] args) {


        String[] list  = {"aaaaaaaa", "vv"};

        String[] checked  = {"abcdfa", "fdsds",};


        ArrayList<String> ar = new ArrayList<String>();


        if(!Arrays.asList(list).contains(checked)){
            for(int i = 0; i < list.length; i++) {
                if(!Arrays.asList(checked).contains(list[i]))
                    ar.add(list[i]);
            }
            System.out.println(ar);
        }
    }

    public static int str(String[] array1, String[] array2) {

        int index = 0;
        int elementLength = array1[0].length();
        int elementLength2 = array2[0].length();
        int max = 0;
        int min = 0;

        for (int i = 1; i < array1.length && i < array2.length; i++) {
            if (array1[i].length() < elementLength | array2[i].length() > elementLength2) {
                index = i;
                elementLength2 = array2[i].length();
                elementLength = array1[i].length();

            }


            while (elementLength2 > elementLength) {
                max = elementLength2;
            }
        }
//            if(elementLength2>elementLength){
//
//                max=elementLength2;
//            }
//            else
//                min=elementLength;
//
//        }

//        }
        int maDif = max - min;


        return maDif;
    }


}



