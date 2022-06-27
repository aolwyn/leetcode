class Solution {
    public boolean isIsomorphic(String s, String t) {
        if( s == null || t == null || s.length() != t.length()) return false;
        
        Map<Character, Integer> charT = new HashMap<>();
        Map<Character, Integer> charS = new HashMap<>();

        for (Integer i = 0; i < s.length(); i++)
            if (charT.put(s.charAt(i), i) != charS.put(t.charAt(i), i))
                return false;

        return true;
    }
}
