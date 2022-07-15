package BInarySearch;


class Solution {
    public int searchInsert(int[] nums, int target) {
        //needs log(n) time, most likely using a binary search. 
        //2 base cases: 
        //case 1: empty array (return -1,)
        //case 2: higher # than the max (return the length)
        
        if(nums.length == 0) return -1; 
       if(target>nums[nums.length-1]) return nums.length;
    
        //keep track of left and right bounds.
        int leftBound = 0;
        int rightBound = nums.length-1;
        int middle = (leftBound + rightBound) / 2;
        
        
        while(leftBound <= rightBound){ //dont forget the less than or equals !
            middle = (leftBound + rightBound) / 2;
            
            if(nums[middle] == target) return middle;
            else if(nums[middle] < target){
                leftBound = middle+1;
            }else{
                rightBound = middle-1;
            }
        }//close while
       
        return leftBound;
    }
}