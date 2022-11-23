import java.util.Arrays;

public class mergesort {

    public static void main(String[] args) {

        int[] arr = new int[]{10,6,2,1,8};

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr, int low, int high) {

        if (high <= low) return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }


    public static void merge(int[] arr, int low, int mid, int high) {

        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = arr[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = arr[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = low; i < high + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    arr[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
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


}
