class Solution {
    public int maxSubArray(int[] nums) {
        //use duh sliding window Baby
        
        //base cases, if length is 0, or null return 0.
        //if length is 1, return the first element
        if(nums.length == 0 || nums == null) return 0;
        if(nums.length == 1) return nums[0];
        
        
        //2 different variables. one keeps track of the running highest sub array, the other 
        //keeps track of subarray values.
        int currMaxSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
           currMaxSum = Math.max(currMaxSum + nums[i], nums[i]);
           maxSum = Math.max(maxSum, currMaxSum);
         }
    return maxSum;
    }
}
