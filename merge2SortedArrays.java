//Q.Merge 2 Sorted array without using Extra Space
package lbDsaSheet;
import java.util.Arrays;
//arrange the numbers of both arrays in accending order 
//then assign the respective values to the first array in the order and rest to the second array 
//USING 2 POINTER APPROACH: let them be i and j
//STEP#1:start the pointers at index 0 of both the arrrays, compare these values, if j<i then swap the smaller value to array 1.
//STEP#2:now increment the value of i, 
//STEP#3: check is array 2 is sorted or not? there is a chance that after swapping array 2 gets unsorted
//STEP#4:swap the numbers within array 2 to maintain sorting (this intra swapping will reduce complexity), TC-O(m+n), SC-O(1)
//repeat the same process
public class merge2SortedArrays {

    public static void main(String[] args){

        //sorted arrays
        int[] arr1={1,3,5,7};
        int[] arr2={0,2,6,8,9};

        int n= arr1.length;
        

        int i=0, j=0;

        while(i<n){
            if(arr1[i]>arr2[j]){//if element of array_1 is greater than that of array_2
                //Swapping
                int temp = arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                fixArr2(arr2);
            }
            i++; //i needs to incremented in every case

            //check if array_2 is sorted now or not?
            
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
           
    }
    static void fixArr2(int[] arr2){
        for(int i=1; i<arr2.length;i++){
            if(arr2[i]<arr2[i-1]) {
            int temp = arr2[i];
            arr2[i]=arr2[i-1];
            arr2[i-1]=temp;
            }
            
        }
    }

}
   
