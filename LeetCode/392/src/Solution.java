class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        
        int j=0;
        for(int i=0; i<tLen; i++) {
        	if(sLen == j) {
        		break;
        	}
        	
        	char tCh = t.charAt(i);
        	char sCh = s.charAt(j);
        	
        	if(sCh == tCh) {
        		j++;
        	}
        }
        
        if(sLen == j) {
        	return true;
        } else {
        	return false;
        }
    	
    }
}