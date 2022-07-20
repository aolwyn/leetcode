class Solution {
    public boolean isPalindrome(String s) {
        //base case: if the length of the string is 0 or the string is null
        if(s.length() == 0 ||s == null) return false;
        
        //Two pointer, iterate from both ends of the string.
        int left = 0;
        int right = s.length()-1;
        
        //while the pointers have not metup
        while(left < right){
            //3 cases:
            //case 1 & 2: either character is not a letter or digit, skip the character at that position and 
            //increment/decrement the position accordingly. 
            if(!Character.isLetterOrDigit(s.charAt(left))) left++;
            else if(!Character.isLetterOrDigit(s.charAt(right))) right--;
            
            //case 3: take the character at beginning and end, set to lowercase, compare.
            //if they do not matchup, the string is not a valid palindrome. 
            else{
                if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))) return false;
                left++;
                right--;
            }
        }
        //if it passes all the test cases, then it is a valid palindrome.
        return true;
        }   
    }