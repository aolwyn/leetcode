package BinarySearch;

class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x == 1) return 1;
        
        int left = 1;
        int right = x;
        
        while(left <= right){
            int middle = left + ((right-left)/2);
            
            if(middle == x / middle) 
                return middle;
            else if(middle > x / middle) 
                right = middle - 1;
            else if (middle < x / middle) 
                left = middle + 1;
            
            
        }//close while
        
        return right;
    }
       
}