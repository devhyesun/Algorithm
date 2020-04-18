class Solution {
    public String addBinary(String a, String b) {
    	StringBuilder sb = new StringBuilder();
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        boolean upper = false;
        
        while(aLen>=0 || bLen>=0) {
        	char aCh = ' ';
        	char bCh = ' ';
        	
        	if(aLen >= 0) {
        		aCh = a.charAt(aLen--);
        	} 
        	
        	if(bLen >= 0) {
        		bCh = b.charAt(bLen--);
        	}
         	
        	if(aCh==' ' && bLen>=0) {
        		if(bCh == '1') {
        			sb.insert(0, upper?0:1);
        		} else {
        			sb.insert(0, upper?1:0);
        			upper = false;
        		}
        		
        		continue;
        	}
        	
        	if(bCh==' ' && aLen>=0) {
        		if(aCh == '1') {
        			sb.insert(0, upper?0:1);
        		} else {
        			sb.insert(0, upper?1:0);
        			upper = false;
        		}
        		
        		continue;
        	}
        	
        	if(aCh == bCh) {
        		sb.insert(0, upper?1:0);
        		upper = (aCh == '1');
        	} else {
        		sb.insert(0, upper?0:1);
        	}
        }
        
        if(upper) sb.insert(0, 1);
        
        return sb.toString();
    }
}