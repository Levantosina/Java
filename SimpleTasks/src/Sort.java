import java.util.Arrays;


public class Sort {
    public static void main(String[] args) {




//        int []arr=new int[]{9,3,10,2};
//        insertion(arr);
//        System.out.println(Arrays.toString(arr));



        int arr1[] = {1, 2, 40, 50, 90, 100};
        int key = 40;
        int result = binary(arr1, 0, arr1.length, key);

        if (result == -1)
            System.out.println("not present");
        else
            System.out.println(result);
//
        //   int arr2[] = {1, 2, 40, 3, 90, 100};

       //countSort(arr2);
      //  System.out.println(Arrays.toString(arr2));
//        insertion(arr2);
//        System.out.println(Arrays.toString(arr2));
//
//
//
//
//
//        int arr3[]= {10,6,2,1,8};
//
//          merge(arr3,0,arr3.length-1);
//
//        System.out.println(Arrays.toString(arr3));


      //  int arr4[]={10,6,2,1,8};
//
      //  quickSort(arr4,0,arr4.length-1);
     //   System.out.println(Arrays.toString(arr4));

//        int[] arr1=new int[] {6,2,1,8,3,1};
//        quickSort(arr1,0,arr1.length-1);
//        System.out.println(Arrays.toString(arr1));

      //  int[] arr2 = new int[] {6,2,21,1,2,3,4,3,4,8};
     //   countSort(arr2);
     //   System.out.println(Arrays.toString(arr2));
        System.out.println("Number of inversions are " +
                getInvCount(arr.length));

    }

    public static void insertion(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }


    }

    public static int binary(int[] arr, int low, int high, int key) {

        int mid = low + (high - low) / 2;

        if (high >= low) {

            if (arr[mid] == key)
                return mid;

            if (arr[mid] > key)
                return binary(arr, low, mid - 1, key);
            else
                return binary(arr, mid + 1, high, key);
        }
        return -1;

    }

    public static void mergeSort(int[] arr, int low, int mid, int high) {

        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = arr[low + i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = arr[mid + i + 1];
        }



        int rightIndex = 0;
        int leftIndex = 0;

        for (int i = low; i < high + 1; i++) {

            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    arr[i] = leftArray[leftIndex];
                    leftIndex++;
                } else{
                    arr[i] = rightArray[rightIndex];
                rightIndex++;
            }
            } else if (leftIndex < leftArray.length) {
                arr[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                arr[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }


    public static void merge(int []arr,int low,int high){
        if (high <= low) return;

        int mid = (low + high) / 2;
        merge(arr, low, mid);
        merge(arr, mid + 1, high);
        mergeSort(arr, low, mid, high);
    }


    public static void quickSort(int[]arr,int from,int to){

        if(from<to){


            int divideIndex=partition(arr,from,to);

            quickSort(arr,from,divideIndex-1);
            quickSort(arr,divideIndex,to);


        }

    }

    private  static int partition(int []arr,int from,int to){

        int rigthIndex=to;
        int leftindex=from;
        int pivot=arr[from+(to-from)/2];

        while (leftindex<=rigthIndex){

            while (arr[leftindex]<pivot){
                leftindex++;

            }
            while (arr[rigthIndex]>pivot){
                rigthIndex--;
            }

            if(leftindex<=rigthIndex){

                swap(arr,rigthIndex,leftindex);
                leftindex++;
                rigthIndex--;
            }
        }
        return leftindex;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int tmp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=tmp;

    }


    public static void countSort(int []array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >max) {
                max = array[i];

            }

        }
        int[] countArray = new int[max+1];

        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }
        int index =0;

//        for (int i = max;i >=0; i--) {
//
//            for (int j = 0; j <countArray[i]; j++) {
//                array[index] = i;
//                index++;
//
//            }
//
//        }
    for (int i = 0 ;i <countArray.length; i++) {

        for (int j = 0; j <countArray[i]; j++) {
            array[index] = i;
            index++;

        }

    }

    }

static int arr[]=new int[]{1,20,6,4,5};
    static  int getInvCount(int n){
        int inv_count=0;
        for(int i=0;i<n-1;i++)
            for (int j=i+1;j<n;j++)
                if(arr[i]>arr[j])
                    inv_count++;

        return inv_count;
    }

}







































