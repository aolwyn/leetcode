public class Solution {
    // you need to treat n as an unsigned value
  
  //have a pivot integer that iterates through each single bit integer of the 32-bit number
  //bitwise and check the pivot number with original
    public int hammingWeight(int n) {
       int pivot = 1;
        int count = 0;
        for (int i = 0; i < 32; i ++){
            int p = pivot << i;
            if ((n & p) == p)
                count++;
        }
        return count;
        
    }//close hammingWeight
}//close Solution
