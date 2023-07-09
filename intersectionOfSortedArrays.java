package lbDsaSheet;
import java.util.ArrayList;
import java.util.List;

//INTERSECTIOM
//using Two Pointer approach
//moving L and till L matches the element at R, once L=R then save that element and increment both L and R
//every pointer has to first compare the element with it's previous position and avoid duplicates
//when any one integer array exhausts then no intersection can be found anymore
public class intersectionOfSortedArrays {
    public static void main(String[] args){
        int arr1[]={1,1,1,2,2,3,3,3};
        int arr2[]={3,3,3,4}; 

        //pointers
        int left=0, right=0;

        //RESULT
        List<Integer> result= new ArrayList<>();

        //if one array exhausts then there'll be no more intersection 
        while(left<arr1.length && right<arr2.length){

            //Skip Duplicate
            while(left>0 && left<arr1.length && arr1[left]==arr1[left-1]){
                left++;
            }
            while(right>0 && right<arr2.length && arr2[right]==arr2[right-1]){
                right++;
            }

            //EDGE CASE: when one array gets exhausted 
            if(left>=arr1.length ||right>arr2.length){
                break;
            }

            //COMPARISOM
            if(arr1[left]<arr2[right]){
                left++;
            }else if(arr1[left]>arr2[right]){
                right++;
            }else{
                result.add(arr1[left]);
                left++;
                right++;
            }

        }

        System.out.println(result);

    }

    
}
