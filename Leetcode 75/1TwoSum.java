class Solution {
    public int[] twoSum(int[] nums, int target) {
 
          
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        if(nums.length ==0)  return null;
        
        
        while(left < right){
            
            int sum = nums[left] + nums[right];
            
            if(sum > target){ 
              
                right--;
            }
            else if (sum < target){ 
                left++;
            }else{
                return new int[] {left, right}; 
            } 
        }
        return null;
    }
}