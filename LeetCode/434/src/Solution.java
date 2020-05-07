class Solution {
    public int countSegments(String s) {
    	if(s.isBlank()) {
    		return 0;
    	}
    	
        String[] sp = s.split(" ");
        int cnt = 0;
        for(String str : sp) {
        	if(!str.isBlank())
        		cnt++;
        }
        
        
        return cnt;
    }
}