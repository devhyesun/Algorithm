import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        String[] split = paragraph.toLowerCase().split("[^a-z]+");
        int len = split.length;
        
        List<String> ban = Arrays.asList(banned);
        
        for(int i=0; i<len; i++) {
        	if(!ban.contains(split[i])) {
        		map.put(split[i], map.getOrDefault(split[i], 0) + 1);
        	}
        }
        
        String result = "";
        int max = Integer.MIN_VALUE;
        for(String key : map.keySet()) {
        	int value = map.get(key);
        	
        	if(max < value) {
        		max = value;
        		result = key;
        	}
        }
        
        return result;
    }
}