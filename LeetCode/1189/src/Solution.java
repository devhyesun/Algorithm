class Solution {
    public int maxNumberOfBalloons(String text) {
    	final String balloon = "balloon";
    	
    	int result = Integer.MAX_VALUE;
    
        int alpha[] = new int[26];
       
        int len = text.length();
        for(int i=0; i<len; i++) {
        	char ch = text.charAt(i);
        	alpha[ch - 'a']++;
        }
        
        // balloon의 각 한 글자씩 카운트의 최소값으로 balloon 갯수 체크
        len = balloon.length();
        for(int i=0; i<len; i++) {
        	char ch = balloon.charAt(i);
        	int cnt = alpha[ch - 'a'];
        	if(ch == 'l' || ch == 'o') {
        		result = Math.min(result, cnt / 2);
        	} else {
        		result = Math.min(result, cnt);	
        	}
        }
        
        return result;
    }
    
}