package lbDsaSheet;
import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr) {
        int n = arr.length;
        //n/2-> since we only have to reach till the middle of array to swap elements on both side of the middle element
        for(int i=0; i<n/2;i++){
            int temp =arr[i];
            //swapping first position with last overwrites the last element on the first position, to avoid losing the first element we temporarily save it in s var.
            arr[i]=arr[n-1-i]; //1=5
            arr[n-1-i]=temp;
        }
    }
}




