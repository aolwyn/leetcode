class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //nice solution using the properties of a set (no duplicates)
      if(nums==null || nums.length==0)
          return false;
 
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            if(!set.add(i)){
                return true;
        }
    }
    return false;
    }
}

  /*
        brute force O(N) method using sorting 
        
        
        if(nums.length == 0) return false;
        if(nums.length == 1) return false;
        
        Arrays.sort(nums);
        int l = 0;
        int r = 1;
       
        int temp = 0;
        while(r < nums.length){
            int one = nums[l];
            int two = nums[r];
            
            if(one == two) return true;
            l++;
            r++;
        }
        
         
        return false;
        */