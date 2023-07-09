//Q. Minimize the Heights
package lbDsaSheet;

import java.io.*;
import java.util.*;

//Given array contains the height of the towers
//case1: Subtract the shortest height from the tallest height given then minimise the result futher
//this is to be done by using the given value of k
//k can be added or subtracted to any given tower's height
public class minHeight {
    public static void main(String[] args) throws Exception {

        int k = 2, n = 4;
        int arr[] = { 1, 5, 8, 10 };
    }

    int getMinDiff(int[] arr, int n, int k) {
        // code here

        // base case
        if (n == 1)
            return 0;

        Arrays.sort(arr);

        // max difference
        int diff = arr[n - 1] - arr[0];

        int min, max;

        for (int i = 1; i < n; i++) {

            // After the operation, the resultant array should not contain any negative integers.
            if (arr[i] - k < 0)continue;
            max = Math.max(arr[i - 1] + k, arr[n - 1] - k); // subtracting k from largest element and comparing the max from the rest of the elements after subtracting k from them
            min = Math.min(arr[0] + k, arr[i] - k); // adding k to the smallest element and comparing the min from the rest of the elements after adding k to them

            diff = Math.min(diff, max - min);
        }
        return diff;

       

    }
    System.out.println(diff);
}
