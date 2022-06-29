class Solution {
    public int largestPerimeter(int[] nums) {
        if(nums.length < 3) return 0; //base case, not enough #'s
        
        Arrays.sort(nums);
         int n= nums.length;
         for (int i =n - 1; i > 1; --i)
             if (nums[i] < nums[i - 1] + nums[i - 2])
                 return nums[i] + nums[i - 1] + nums[i - 2];
         return 0;
    }
         
    
}
