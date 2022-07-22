class Solution {
    public String addBinary(String a, String b) {
        //base cases: if string = 0, or if one is empty but other is not.
        if(a.length() != 0 && b.length() ==0) return a;
        if(b.length() != 0 && a.length() ==0) return b;
        
        StringBuilder sb = new StringBuilder(); 
        int i = a.length() - 1;
        int j = b.length() -1; 
        int carry = 0; 
        
        while (i >= 0 || j >= 0) {
            int sum = carry; //if there is a carry from the last addition, add it to carry 
            if (j >= 0) sum += b.charAt(j--) - '0'; //we subtract '0' to get the int value of the char from the ascii
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2); //if sum==2 or sum==0 append 0 cause 1+1=0 in this case as this is base 2 (just like 1+9 is 0 if adding ints in columns)
            carry = sum / 2; //if sum==2 we have a carry, else no carry 1/2 rounds down to 0 in integer math
        }
        if (carry != 0) sb.append(carry); //leftover carry, add it
        return sb.reverse().toString();
    }
}