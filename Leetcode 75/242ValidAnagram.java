class Solution {
    public boolean isAnagram(String s, String t) {
        //2 base cases:
        //1. if either are emtpy
        //2. if the string lengths are not equal
        
        //if either of them are empty
        if(s.length() ==0 || t.length() == 0) return false;
        
        //if the lengths aren't the same
        if(s.length() != t.length()) return false;
        
        //Algorithm: 
        //we will be using 1 hashmap to fill with one of the letters. if
        HashMap<Character, Integer> SLetters = new HashMap<Character, Integer>();
        
        //populate the hashmap with the letters and # of occurences of each letter for one of the strings.
        for(int i = 0; i < s.length(); i++){
            SLetters.put(s.charAt(i), SLetters.getOrDefault(s.charAt(i), 0)+1);
        }
        
        //now, we check the other string and compare to the hashmap.
        for(char TLetter: t.toCharArray()){
            //if the letter is within the hashmap, decrement the value in the hashmap.
            //if the value goes negative, we know it has been exhausted and is false.
            if(SLetters.containsKey(TLetter)){
                SLetters.put(TLetter, SLetters.get(TLetter)-1);
                if(SLetters.get(TLetter)< 0) return false;
                
             }else{//this final check here is if the letter is not in the hashmap; therefore, it is false. 
                return false;
            }
        }//close for
        return true;
    }
}

//the alternate solution takes advantage of the fact that all letters will be lowercase.
//we can set each string to be an array of characters (.toCharArray) and then use Array.equals 
//to determine if they are viable anagrams or not. 
//THIS BELOW SOLUTION PERFORMS BETTER FOR THE SPECIFICATIONS. 
/*

class Solution {
    public boolean isAnagram(String s, String t) {
        int lens = s.length(), lent = t.length();
        
        if (lens != lent) {
            return false;
        }
        
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        
        Arrays.sort(chars);
        Arrays.sort(chart);
        
        return Arrays.equals(chars, chart);
    }
}
*/