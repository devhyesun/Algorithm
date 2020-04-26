import java.util.*;

class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        
        if(len < 1) return true;
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<len; i++) {
        	char ch = s.charAt(i);
        	
        	if(ch == '(' || ch == '{' || ch == '[') {
        		stack.push(ch);
        	} else {
        		if(stack.size() == 0) return false;
        		char open = stack.pop();
        		
        		if(ch == ')' && open != '(') {
	        		return false;
	        	} else if(ch == '}' && open != '{') {
	        		return false;
	        	} else if(ch == ']' && open != '[') {
	        		return false;
	        	}
        	}
        }
        
        if(stack.size() != 0) return false;
        
        return true;
    }
}