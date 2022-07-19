class Solution {
    public int maxSubArray(int[] nums) {
        //use duh sliding window Baby
        
        //base cases, if length is 0, or null return 0.
        //if length is 1, return the first element
        if(nums.length == 0 || nums == null) return 0;
        if(nums.length == 1) return nums[0];
        
        //one variable to keep track of the running sum, another to keep track of the overall best
        int currMaxSum = nums[0];
        int maxSum = nums[0];
        
        for(int i =1; i < nums.length; i++){
            //update running sum by adding on next contiguous value. check it vs it on its own.
            currMaxSum = Math.max(currMaxSum+nums[i], nums[i]);
            maxSum = Math.max(currMaxSum,maxSum);//compute the new total max. 
        }
        return maxSum;
        
    }
}