package TwoPointer;

import java.util.Arrays;

public class Solution2Sum {
    public int[] twoSum(int[] nums, int target) {
        //need null check?
        //2 counters, one for start one for end.
        //iterate through if target is higher or lower than sum of 2 numbers, use a recursive call
        //sort first!
        //idea is if its lower than target, increment the lower number. if it's higher, increment the right side 
        
        
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        if(nums.length ==0)  return null;
        
        
        while(left < right){
            
            int sum = nums[left] + nums[right];
            
            if(sum > target){ //sum > target, 
              
                right--;
            }
            else if (sum < target){ //sum < target
                left++;
            }else{
                return new int[] {left, right}; //correct on first try
            } 
        }
        return null;
        

    }
}
