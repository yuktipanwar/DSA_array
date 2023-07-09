package lbDsaSheet;
import java.util.ArrayList;
import java.util.List;
public class uNi {
    public static void main(String[] args){
        int arr1[] = {1,1,1,2,2,3,3,3};
        int arr2[] = {3,3,3,4};

        //pointers
        int left=0, right=0;


        //RESULT
        List<Integer> result= new ArrayList<>();

        while(left<arr1.length|| right<arr2.length){

            //Skip Duplicate
            //for arr1
            while(left>0 &&left<arr1.length && arr1[left]==arr1[left-1]){
                left++;
            }

            //for arr2
            while(right>0 &&right<arr2.length && arr2[right]==arr2[right-1]){
                right++;
            }
            
            //EDGE CASE: one array exhauts
            if(left>=arr1.length){
                result.add(arr2[right]);
                right++;
                continue;
            }

            if(right>=arr2.length){
                result.add(arr2[left]);
                left++;
                continue;
            }

            //comparison
            if(arr1[left]<arr2[right]){
                result.add(arr1[left]);
                left++;
            }else if(arr1[left]>arr2[right]){
                result.add(arr2[right]);
                right++;
            }else{
                result.add(arr1[left]);
                right++;
                left++;
            }
            

        }
        System.out.println(result);


    }
    
}
