class Solution {
    public boolean isIsomorphic(String s, String t) {
      //constraint check
        if( s == null || t == null || s.length() != t.length()) return false; 
        
      //two hashmaps for the chars
        Map<Character, Integer> charT = new HashMap<>();
        Map<Character, Integer> charS = new HashMap<>();

        for (Integer i = 0; i < s.length(); i++)
            if (charT.put(s.charAt(i), i) != charS.put(t.charAt(i), i))
                return false;

        return true;
    }
}
