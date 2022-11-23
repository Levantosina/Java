import java.util.Arrays;

public class average {

public static double alg(int []arr ){
    if(arr.length==1)
        return arr[0];
    if(arr.length==2)
        return (float) (arr[0]+arr[1])/2;
    int []arr2=new int[arr.length-2];
    for(int i=0;i<arr2.length;i++) {
        arr2[i] = arr[i + 1];
    }
    return  alg(arr2);
}
   public static int sum(int n) {
        int m = 0;
        for (int i = 1; i <= n; i++) {
            m += i;
        }
        return m;
}

    public static int avr(int arr[]){
        int sum=0;
        for (int i = 0; i <arr.length-1 ; i++) {

             sum+=arr[i];
        }
       int average=sum/arr.length;
       return average;
    }
public static int smallestDifference(int[] arr) {
    Arrays.sort(arr); //O(n log(n) )
    int smallestDifference = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length-1; i++) {
        int difference = arr[i + 1] - arr[i];
        if (smallestDifference > difference) {
            smallestDifference = difference;
        }
    }
    return smallestDifference;
    // time complexity O(Max(nlog(n), n) = O(n log(n))
}
public static void countSort(int []array) {

    int max = array[0];
    for (int i = 0; i < array.length; i++) {
        if (array[i] >max) {
            max = array[i];

        }

    }
        int[] countArray = new int[array.length];
//        int unique = 0;

      //  just to make sure everything is 0
//        for (int i = 0; i <= small; i++) {
//          countArray[i] = 0;
//        }

        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }

        int index =0;

        for (int i = max ;i >=0; i--) {

            for (int j = 0; j <countArray[i]; j++) {
                array[index] = i;
                index++;

                }

            }
//    for (int i = 0 ;i <countArray.length; i++) {
//
//        for (int j = 0; j <countArray[i]; j++) {
//            array[index] = i;
//            index++;
//
//        }
//
//    }

        }


 //   {2,1,2,3,4,3,4,5};

    public  static  void insertionSort(int []arr){
        for (int i = 0; i < arr.length; i++) {
        int current = arr[i];
        int j=i;
            while (j > 0 && arr[j-1]>current){
            arr[j]=arr[j-1];
            j--;
            }
            arr[j]=current;
        }

    }
    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
//public static void middle(int []arr){
//    int strart=0;
//    int end=arr.length-1;
//
//    int mid=strart+(end-strart)/2;
//System.out.println(mid);
//}
    public static void main(String[] args) {



        int[] arr1 = new int[] {2,1,2,3,4,3,4,5};
        int[] arr2 = {1,7,4,5,77,110,200};
        int[] arr3 = {1,7,110,200,20};
        countSort(arr1);
        System.out.println(Arrays.toString(arr1));
   //     middle(arr1);


        //System.out.println(alg(arr1));
       // insertionSort(arr1);
       // System.out.println(Arrays.toString(arr1));
     //   countSort(arr1);
 // System.out.println(Arrays.toString(arr1));


 // System.out.println("middle of array "+(float)avr(arr2));
      //  System.out.println(" average"+alg(arr2));
      //  System.out.println(countSort(arr1));
//        System.out.println("Smallest difference of " +Arrays.toString(arr1) +
//                " is " + smallestDifference(arr1));
//        System.out.println("Smallest difference of " +Arrays.toString(arr2) +
//                " is " + smallestDifference(arr2));
//        System.out.println("Smallest difference of " +Arrays.toString(arr3) +
//                " is " + smallestDifference(arr3));

     //   int []arr1={1,2,3,4};
    //    System.out.println(avr(arr1));

     //   double[] arr = {2,3,2};
      //  double total = 0;

     //   for(int i=0; i<arr.length; i++){
      //      total = total + arr[i];
      //  }


        /* arr.length returns the number of elements
         * present in the array
         */
     //   double average = total / arr.length;

        /* This is used for displaying the formatted output
         * if you give %.4f then the output would have 4 digits
         * after decimal point.
         */
       // System.out.format("The average is: %.3f", average);


//        int arr3[] = {12, 22, 34, 22, 54, 6, 52,9,8};
//        // Printing the array
//        System.out.println("The array elements are : "+Arrays.toString(arr3));
//        int startIndex = 0, lastIndex = arr3.length - 1;
//        // Setting the mid index
//        int midIndex = startIndex + (lastIndex-startIndex)/2;
//        System.out.println("The mid index is "+midIndex+" and the element at mid is "+arr3[midIndex]);

        }



}
