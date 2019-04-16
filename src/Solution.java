import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    // Complete the climbingLeaderboard function below.
    static int climbingLeaderboard(int k, int[] height) {
       int count = 0;
        List<Integer> heightlist = new ArrayList<>();


        for(int i=0; i<height.length ;i++){
          heightlist.add(height[i]);
        }
        int max = Collections.max(heightlist);
        if(k < max) {
            count = Math.abs(k - max);
        }
       return count;

    }

    static int binarySearch(int[] arr, int low, int high, int key) {
        if (high < low)
            return -1;
        if (high == low)
            return low;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, low, mid - 1, key);
            return binarySearch(arr, mid + 1, high, key);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] alice = {2,5,4,5,2};
        int n  = climbingLeaderboard(7, alice);

    }
}
