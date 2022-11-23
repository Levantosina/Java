import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class heap {
    public static void main(String[] args) {
        PriorityQueue<Integer>maxQueue=new PriorityQueue<Integer>(Collections.reverseOrder());
        maxQueue.add(2);
        maxQueue.add(33);
        maxQueue.add(14);
        maxQueue.add(0);
        maxQueue.add(55);
        maxQueue.add(23);
        maxQueue.add(8);
        maxQueue.add(99);
        maxQueue.add(1);
        System.out.println(maxQueue);
        System.out.println(maxQueue.peek());


        int []arr=new int[9];
      for (int i = 0; i <arr.length-1 ; i++) {
           arr[i]=maxQueue.poll();
            System.out.println(maxQueue);
       }
        //System.out.println(Arrays.toString(arr));

    }
}
