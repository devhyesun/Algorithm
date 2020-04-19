class Solution {
    public boolean validMountainArray(int[] A) {
    	boolean acs = true;
    	int len = A.length;
    	
    	if(len < 3 || A[0] > A[1]) {
    		return false;
    	}
    	
    	int num = A[0];
    	for(int i=1; i<len; i++) {
    		if(num == A[i]) {
    			return false;
    		}
    		
    		if(acs) {
    			if(num > A[i]) {
    				acs = false;
    			}
    		} else {
    			if(num < A[i]) {
    				return false;
    			}
    		}
    		
    		
    		num = A[i];
    	}
    	
    	return !acs;
    }
}