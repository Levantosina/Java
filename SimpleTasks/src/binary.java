public class binary {
    public static void main(String[] args) {

       binary ob=new binary();
        int arr[]= {1,2,40,50,90,100};
        int n=arr.length;
        int key=100;
        int result=ob.binarySearch(arr,0,n-1,key);

        if(result==-1)
            System.out.println("not present");
        else
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int low, int high, int key){

        int mid=low+(high-low)/2;
        if(high>=low){

            if(arr[mid]==key)
                return mid;

            if(arr[mid]>key)
                return binarySearch(arr, low, mid - 1, key);

            else
                return binarySearch(arr,mid+1,high,key);

        }
        return -1;



    }

}
