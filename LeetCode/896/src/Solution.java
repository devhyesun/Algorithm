class Solution {
    public boolean isMonotonic(int[] A) {
        int len = A.length;
        int sort = -1;	// 0: 내림차순, 1: 오름차순.
        int num = A[0];
        
        for(int i=1; i<len; i++) {
        	
        	if(num < A[i]) {
        		if(sort == 0) {
        			return false;
        		}
        		sort = 1;
        	} else if(num > A[i]) {
        		if(sort == 1) {
        			return false;
        		}
        		
        		sort = 0;
        	}
        	
        	num = A[i];
        }
        
        
        return true;
    }
}