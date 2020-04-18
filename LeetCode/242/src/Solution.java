import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
    	int len = s.length();
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	
    	if(len != t.length()) {
    		return false;
    	}

    	for(int i=0; i<len; i++) {
    		char ch = s.charAt(i);
    		
    		map.put(ch, map.getOrDefault(ch, 0) + 1);
    	}
    	
    	len = t.length();
    	for(int i=0; i<len; i++) {
    		char ch = t.charAt(i);
    		
    		if(map.getOrDefault(ch, 0) <= 0) {
    			return false;
    		} else {
    			map.put(ch, map.get(ch) - 1);
    		}
    	}
    	
    	return true;
    }
}