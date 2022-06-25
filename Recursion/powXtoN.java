package Recursion;

public class powXtoN {
   
        public double myPow(double x, int n) {
            /*
            base cases:
            if n == 0, its 1. 
            if n < 0, it becomes a fraction.
            if x is infinity, the answer is 0.
            */
            
            if(n == 0) return 1;
            
            if(Double.isInfinite(x)) return 0;
            
            if(n<0){
                n = -n;
                x = 1/x;
            }
            
            // binary exponentiation formula using conditional operator 
            return n % 2 == 0 ? myPow(x*x, n/2) : x * myPow(x*x, n/2); 
            
               
        }//close public double myPow
   
}
