class Solution {
    public boolean isValid(String s) {
        //base cases, string is empty or null.
        if(s.length() == 0 || s== null) return false;
        
        //we will use a stack to solve this problem and keep track of the opening parenthesis. 
        Stack<Character> stack = new Stack<>();
        
        
        for(int i = 0; i< s.length(); i++){
        //check incoming parenthesis.
        char sc = s.charAt(i);
            
            //case 1: adding a new open bracket
            if (sc == '{' || sc == '[' || sc == '(') {
                stack.push(sc);
                  
            //nextfew cases cover if closing bracket is next.
            //check each variation, if the stack is empty, and what the previous value was using peek.
                
            }else if(!stack.empty() && sc==')' && stack.peek()=='('){
            stack.pop();
        }
        else if(!stack.empty() && sc==']' && stack.peek()=='['){
            stack.pop();
        }
        else if(!stack.empty() && sc=='}' && stack.peek()=='{'){
            stack.pop();
            
            //case where wrong bracket was entered and it wasnt an open bracket. 
        }else{
           return false; 
        }
            
            
        }//close for
        
        return (stack.empty());
    }
}