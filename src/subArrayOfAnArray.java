import java.io.*;
import java.util.*;

public class subArrayOfAnArray {

    public static boolean isSubArray(int[] arr1, int[] arr2){
        HashSet<Integer> hashSet = new HashSet<>();
        int length1 = arr1.length;
        int length2 = arr2.length;

        for(int i=0;i<length1;i++){
            if(!hashSet.contains(arr1[i]))
                hashSet.add(arr1[i]);

        }
        for(int i=0;i<length2;i++){
            if(!hashSet.contains(arr2[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args){
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 9};

        boolean isSubArr = isSubArray(arr1,arr2);
        System.out.println(isSubArr);
    }
}
