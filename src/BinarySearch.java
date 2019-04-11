import java.util.*;
import java.io.*;
public class BinarySearch {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,5,6,7,8,9,10};
        int length = arr.length;
        int key = 10;
        System.out.print("Position of " +key+ "is"+binarySearchResult(arr,0,length-1,key));

    }
    static int binarySearchResult(int[] arr, int low, int high, int key){

        if (high < low)
            return -1;
        int mid = (low+high)/2;
        if(key == arr[mid])
            return mid;
        if(key > arr[mid])
            return binarySearchResult(arr,mid+1,high,key);
        return binarySearchResult(arr,low,mid-1,key);

    }
}
