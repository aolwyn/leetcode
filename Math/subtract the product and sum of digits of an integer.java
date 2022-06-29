class Solution {
    public int subtractProductAndSum(int n) {
        if(n == 0) return 0;
        int product = 1;
        int sum = 0;
        String s = Integer.toString(n);
        
        //alternate method, use a while loop and modulo
        for(int i = 0; i < s.length(); i++){
            int x = s.charAt(i);
            sum = sum + Character.getNumericValue(x);
            product = product * Character.getNumericValue(x);
        }
        return product-sum;
    }
}
