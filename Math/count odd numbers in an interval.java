class Solution {
    public int countOdds(int low, int high) {
        int oddNumbers = (high - low) / 2;
        
        if (low % 2 != 0 || high %2 !=0) oddNumbers++;
        
        return oddNumbers;
        
        /*
            int count = 0;
        for(int i = low; i <= high; i++){
            if(i%2!=0) count++;
        }
        return count;
      The above also works but takes up a lot of time.
        */
    }
}
