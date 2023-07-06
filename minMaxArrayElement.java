package lbDsaSheet;

//we'll assume the very first element to be by default both min and max.
//as the index will increment min will be compared at let's say second element and if min<second/upcoming element that element value will be assigned to max var.
//time complecitiy = O(n)
//space complecitiy = O(1)
public class minMaxArrayElement {
    public static void main(String[] args){
        int[] arr= {6,2,3,4,1,9}; //min=1, max=9
        findMinAndMax(arr);

    }

    static void findMinAndMax(int[] arr){
        
        if(arr==null || arr.length ==0)return;
        int min= arr[0];
        int max= arr[0];
        
    // USING MATH FUNCTION
    //  for(int i=1; i<arr.length; i++){
    //      min = Math.min(min, arr[i]);
    //      max = Math.max(max, arr[i]);
    //}

        for(int i=1; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max = arr[i];

            }
        }
        System.out.println(max+" maximum");
        System.out.println(min+" minimum");
    }
    
    
}
