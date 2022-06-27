class Solution {
    public int[] runningSum(int[] nums) {
        int runningNumber = 0;
        int[] returned = new int[nums.length];
        
        for(int i = 0; i <nums.length;i++){
            runningNumber = runningNumber+nums[i];
            returned[i] = runningNumber;    
        }//close for
        return returned;
    }//close method
}//close class
