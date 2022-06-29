class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        //base case, lengths are different
        if(s1.length() != s2.length()) return false;
        
        //2 variables to track indexes of differing characters
        int idx1 = -1;
        int idx2 = -1;
        
        //3 cases. 
        //case 1: no differences (return true)
        //case 2: there is a difference. (mark the indexes.)
        //case 3: more than 1 difference. (return false.)
        
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                //if / else if chain wont be triggered concurrently
                if(idx1 == -1) idx1 = i;
                else if(idx2 == -1) idx2 =i;
                else return false;     
            }//close if
        }//close for
        
        if(idx1 == -1 && idx2 == -1) return true;
        if(idx2 < 0) return false;
        if(s1.charAt(idx1) == s2.charAt(idx2) && s1.charAt(idx2) == s2.charAt(idx1)) return true;
        
        return false;
         
    }
}
