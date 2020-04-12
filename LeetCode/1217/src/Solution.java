class Solution {
    public int minCostToMoveChips(int[] chips) {
    	int len = chips.length;
    	
    	if(len == 1) return 0;
    	
    	int odd = 0, even = 0;
    	
    	for(int i=0; i<len; i++) {
    		if(chips[i]%2 == 0) {
    			even++;
    		} else {
    			odd++;
    		}
    	}
    	
    	return Math.min(odd, even);
    }
}