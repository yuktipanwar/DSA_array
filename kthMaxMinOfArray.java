//Find the Kth Max and Min element of the array
package lbDsaSheet;
import java.util.Arrays;

//if we sort the array than finfing out the kth min/max element will become very easy
//merge sort/heap sort can be used
//time complexity = O(nlogn)
//this can be optimised even more by using heap data structure
//create a heap of size n since array has n elements
//let k=3, if we create a max heap(with the largest element 0n top) than to find kth min element we have to pop k-1 elements from the top
public class kthMaxMinOfArray {

    public static void main(String[] args) {
        int[] arr = {6,2,3,4,1,9};
        int k=3;

        //inbuilt function to sort
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }


}