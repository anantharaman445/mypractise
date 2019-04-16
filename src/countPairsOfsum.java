import java.io.*;
import java.util.*;
public class countPairsOfsum {
    public static int countPairs(int[] arr,int sum){
        HashSet<Integer> hashSet = new HashSet<>();
        int count=0;
        for(int i=0;i< arr.length;i++){
            int temp = sum-arr[i];
            if(temp > 0 && hashSet.contains(temp))
                count++;

            hashSet.add(arr[i]);
        }
        return count;
    }

    public static void main(String[] args){
        int sum = 6;
        int arr[] = new int[]{1, 5, 5, 5, 5} ;
        System.out.println("Count of pairs is " +
                countPairs(arr,sum));
    }
}
