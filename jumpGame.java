//Q.Minimum number of Jumps to reach end of an array
package lbDsaSheet;

//the values entered in the array are the max number of times you can jump at that step/index
//start from the very first position and the goal is the very last position
//eg- if value enetered at index 0=2, then jump two positions(you can either jump 1 times or maximum of 2 times in this case) and reach index 2, and at index 2 value is 1 so jump to index 3 and so on
//the value written at the very last index won't support the jump, just end there
//this can also be solved using graph algo BFS

//METHOD: TC-O(n), SC-O(1)
//start from index 0 and take the max possible jump.
//create a current position, a destination and a jump counter var. 
//update these accordinly. 
//now rather than going to the index of maximum possinle jump's resultin index, check the path from the very next index of index 0(index 1)
//after repeating these steps compare the destination to have onptimised jumps value
public class jumpGame {
    public static int jump(int[] nums){
        //counting jumps
        int jump=0;

        //current position
        int pos=0;

        //destination
        int des=0;

        for(int i=0;i<nums.length-1;i++){//length-1 because we don't have to jump at the very last index

        //checking max destination at every index
        //whereever you are(nums[i]) add the index into the value(i) and check how further you can go
        des=Math.max(des,nums[i]+i);//index=2
        if(pos==i){//pos==2
            pos=des;//then des=2
            jump++;
        }

        }
        return jump;

    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 2,3,0,1,4 };
        System.out.println("Minimum jumps is "+jump(arr));
    }

}

