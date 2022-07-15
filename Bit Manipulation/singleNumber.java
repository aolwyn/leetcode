class Solution {
    public int singleNumber(int[] nums) {
        //base case: 1 element in the array 
        if(nums.length == 1) return nums[0];
        
        //pretty sure this could be solved using a mashmap, but it's easier with bit manipulation.
        //to use bit manipulation, we will exploit XOR gates - by summing all values, duplicates will XOR
        //themselves out.
        
        int temp = nums[0]; //start value
        for(int i = 1; i < nums.length;i++)
            temp = temp ^ nums[i];  
        
         return temp; 
    }
   
}