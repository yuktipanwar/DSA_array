//************VERY IMPORTANT************//
//Q. Largest Sum Contiguous Subarray: 
//************************************//
package lbDsaSheet;

import java.io.*;
import java.util.*;

//THROUGH KADANE'S ALGO, TC= O(n), SC=O(1)
//there are two variables in this algo, one is 'current sum' and other is 'best sum'.
//current sum can be taken as 0 ans helps in addition
//best sum will store the maximum contigious array's sum
//in Kadane's algo best sum starts with 0, however since negative no. can be present so we take best sum as Integer_Min
//in worst case all numbers can be Int min.
//In this algo, we start calculation from index 0 or the very first element of the array

public class largestSubArrSum2 {

    static void maxSubArraySum(int nums[], int size)
    {
        int bestSum= Integer.MIN_VALUE;
        int currentSum=0;

        for (int i=0; i<size; i++ ){
            //compare currentSum at every point
            currentSum = Math.max(nums[i], currentSum+nums[i]);
            bestSum= Math.max(bestSum, currentSum);

        }
        System.out.println("Maximum contiguous sum is "+ bestSum);

    }

    // Driver Code
    public static void main(String[] args) {
        int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = nums.length;
        maxSubArraySum(nums, n);
    }

}
