import java.util.*;
import java.io.*;
public class SearchInSortedRotatedarray {

    static int pivotedBinarySearch(int[] arr,int length, int key){
        int position = -1;

        ////todo this is the traditional linear way
//        for(int i=0;i<length;i++){
//            if(arr[i] == key)
//                position = i;
//        }


        int pivot = findPivot(arr,0,length-1);
        if (pivot == -1)
            return binarySearch(arr, 0, length-1, key);

        if (arr[pivot] == key)
            return pivot;
        if (arr[0] <= key)
            return binarySearch(arr, 0, pivot-1, key);
        return binarySearch(arr, pivot+1, length-1, key);
    }

    static int findPivot(int arr[], int low, int high)
    {
        if (high < low)
            return -1;
        if (high == low)
            return low;

        int mid = (low + high)/2;
        if(mid<high && arr[mid] > arr[mid+1])
            return mid;

        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid-1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid-1);
        return findPivot(arr, mid + 1, high);
    }

    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;

        int mid = (low + high)/2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid -1), key);
    }

    public static void main(String[] abcd){
        int arr1[] = {1,2,3,5,6,7,8,9,10};//1235678910
        int n = arr1.length;
        int key = 5;
        System.out.println("Index of the element is : "
                + pivotedBinarySearch(arr1, n, key));
    }
}
