//Q.Find duplicate in an array of N+1 Integers
package lbDsaSheet;

import java.util.Arrays;
//size of array is N+1
//let say N=5, and the numbers filled in the array are between the range 1....5
//since array size is 6 and values to be filled is between 1-5 then there'll be one duplicate value. that value is to be found here.

//if the array isn't read-only array then it can be editied
//METHOD #1--> sort the array, triverse it simply and find the duplicate. {Merge/Heap sort}TC-O(n*logn),SC(1)

//METHOD #2--> create a count array. then linearly traverse count array to find which value occurs more than once. TC-O(n),SC-O(n)

//METHOD #3--> starting element value(value at index0) ke index per jao aur uspar jakar us value ko -ve kar do
//now check the value at index 1 and go to the index equal to the mentioned value, now make that number -ve
//while repeatinf this process if you reach a index whose value is already -ve that means the number value eqaul to the number of that index is duplicately present. TC-O(n),SC-O(1)

//METHOD #4-->in case the array is read only then solve using Floyd's cycle finding algo

public class findDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 4, 2 };

        // sorting
        Arrays.sort(arr);

        int i, j, freq;
        System.out.println("These elements are repeated along with its frequency-");

        for (i = 0; i < arr.length; i++) {
            freq = 1;
            for (j =i+1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    freq++;
                } else {
                    break;
                }
            }
            i = j - 1;
            if (freq > 1) {

                // printing the output
                System.out.println("Duplicate num:"+arr[i] + " Frequency-->" + freq);
            }

        }

    }
}
