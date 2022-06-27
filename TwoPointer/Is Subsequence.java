class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        
        int count = 0;
        char startChar = s.charAt(count);
        
        for(int i = 0; i < t.length(); i++){
            if(count == s.length()) return true;
            
            if(startChar == t.charAt(i)){
                count++;
                if(count >= s.length()) return true;
                else{
                startChar = s.charAt(count);
                }//close else
            }//close if
            
        }//close for
    
        
        return false;
    }
}//close class
