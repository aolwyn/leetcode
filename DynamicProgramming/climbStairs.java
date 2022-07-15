class Solution {
    public int climbStairs(int n) {
        //base case: 1 or fewer stairs, there's only 1 method.
        if(n <= 1) return 1;
        
        //otherwise, the total different ways is the sum of all the distinct ways of i-2 and i-1 stairs. 
        
        //memoization of remembering the previous amouunt of methods. 
        //initialize the beginning 2 methods (steps 1 and 2.)
        int methods[] = new int[n+1];
        methods[0] = 1;
        methods[1] = 1;
        
        //summation of all the step methods for step #'s greater than 2. 
        for(int i = 2; i <=n; i++){
            methods[i] = methods[i-1] + methods[i-2];
        }
        return methods[n];
    }
}