//************VERY IMPORTANT************//
//Q. Largest Sum Contiguous Subarray
//************************************//

package lbDsaSheet;
import java.io.*;
import java.util.*;


//Contigious Subarray: any sub series of elements in a given array that are contiguous ie their indices are continuous
//can also be solved using dynamic programming
//data type long is recommended
//if the array consists of +ve num only then the entire array can be added to find the Largest Sum Contiguous Subarray
//if the array contains -ve nums only then a solution is any subarray of size 1 containing the maximal value of the array (or the empty subarray, if it is permitted).

//METHOD #1: Find all the subarrays. The number of all possible subarrays of an array of size N is N * (N + 11/21
//TC= O(n^3), SC=O(1)

//METHOD #2: while summing the subarrays we can maintain a running sum var to optimise time complexity.


public class largestSubarraySum {
    static void maxSubArraySum(int nums[], int size)
    {
        //max will store the largest sum of subarray
        //in worst case all the numbers will be equal to int_minimum
        int max= Integer.MIN_VALUE;

        //finding contiguous subarray
        for(int i=0; i<size; i++){ //1234ewss
            //method_2
            //running sum var
            int sum = 0;
            for(int j=i; j<size;j++){
                sum=sum+nums[j];
                
                //addition
                //Method_1
                //int sum = 0;
                //Method_1
                //for(int k=i;k<=j;k++){
                //  sum=sum+nums[k];
              //}
                //COMPARISON
                max= Math.max(sum,max);



            }
        }
        System.out.println("Maximum contiguous sum is "
                           + max);

    }

    //Driver Code
    public static void main(String[] args)
    {
        int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = nums.length;
        maxSubArraySum(nums, n);
    }
}
