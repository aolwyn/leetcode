class Solution {
    public double average(int[] salary) {
        //constraint cases
        if(salary.length <3 || salary.length > 100 || salary.length == 0) return 0;
        
        double sum = Arrays.stream(salary).sum();
        sum = sum - Arrays.stream(salary).min().getAsInt() - Arrays.stream(salary).max().getAsInt();
        
        return sum / (salary.length-2);
    }
}
