class Solution {
    public int pivotIndex(int[] nums) {
        
        if(nums.length == 0) return -1;
        
        int sum = Arrays.stream(nums).sum();
        int runningSum = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            temp = sum - runningSum-nums[i];
            if(runningSum == temp ) return i;
            runningSum = runningSum + nums[i];
            
        }
        return -1;
    }//close method
}//close 
