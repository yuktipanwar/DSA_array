//Move Negatives to one Side of Array
package lbDsaSheet;
import java.util.Arrays;
//two pointer approach (L&R)
//We'll keep solving till L<R, the moment L=R, we will stop traversing and swapping 
//Time complexity= O(n)
//Space Complexity= O(1)
public class moveNumToOneSide {
    public static void main(String[] args){
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9, -6, 3};
        //pointers--> left:first positon, right:last position
        int left= 0, right= arr.length-1;

        while(left<right){
            //starting from left and checing if the number is negative or not, if negative move the pointer forward otherwise stop
            while(arr[left]<0)left++;  //when left comes +ve, then start checking from right
            while(arr[right]>0)right--;// right stops whn right is -ve. 

            //Once L stops at +ve and R stops at -ve, we simpley swap.
            if(left>=right)break; //in case the array is already solved
            
            //swapping
            int temp= arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

        }



        System.out.println(Arrays.toString(arr));
    }

    
}
