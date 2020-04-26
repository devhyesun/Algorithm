class Solution {
    public int countNegatives(int[][] grid) {
    	int cnt=0;
    	int len = grid.length;
    	
    	for(int i=0; i<len; i++) {
    		int j = grid[i].length - 1;
    		while(j>=0 && grid[i][j] < 0) {
    			cnt++;
    			j--;
    		}
    	}
    	
    	return cnt;
    }
}