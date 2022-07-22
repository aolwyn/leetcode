class Solution {
    public int climbStairs(int n) {
        //base case: 0/1 steps, only 1 method.
        //if its above 45 steps, out of bounds. 
     if(n<= 1) return 1;
     if(n>45) return 0;
        
        //the amount of steps is the sum of the two previous steps.
        //as a result, we will use memoization to keep track if the step requirements. We will use an array.
        
        int[] steps = new int[n+1];//total steps = floor # + 1 (for 0th step, ground floor)
        steps[0] = 1;
        steps[1] = 1;
        
        for(int i = 2; i <=n; i++){
            steps[i] = steps[i-1] + steps[i-2];
        }
        int count = steps[n];
        return count;   
    }
}