class Solution {
    public String longestCommonPrefix(String[] strs) {
        int strsLen = strs.length;
        int minLen = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        
        if(strsLen < 1) {
        	return sb.toString();
        }
        
        for(int i=0; i<strsLen; i++) {
        	minLen = Math.min(minLen, strs[i].length());
        }
        
        for(int j=0; j<minLen; j++) {
        	int cnt=1;
        	char ch = strs[0].charAt(j);
        	for(int i=1; i<strsLen; i++) {
        		if(ch == strs[i].charAt(j)) {
        			cnt++;
        		} else {
        			return sb.toString();
        		}
        	}
        	
        	if(cnt == strsLen) {
        		sb.append(ch);
        	}
        }
        
        return sb.toString();
    }
}