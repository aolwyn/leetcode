class Solution {
    public int search(int[] nums, int target) {
        //base cases: nothing or null
        if(nums.length == 0 || nums == null) return -1;

        //left and right bounds of array.
        int left = 0;
        int right = nums.length-1;
        
        //while the values are different / just equal
        while(left <=right){
            int middle = left+(right-left)/2;//recompute middle of the array
            
            if(target==nums[middle]) return middle;//if tbe values match, we good
            else if(target < nums[middle]){//if the target is less than, we look at lower portion of the array
                right = middle-1;

            }else{//otherwise, its in the upper portion, so we look at the right 1/2 of the array
                left = middle+1;
            }
        }
        //if we get to here, it means it doesn't exist in the array.
        return -1;  
    }
    
}