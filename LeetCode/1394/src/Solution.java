class Solution {
    public int findLucky(int[] arr) {
    	int result = -1;
        int freq[] = new int[500];
        int len = arr.length;
        
        for(int i=0; i<len; i++) {
        	freq[arr[i]]++;
        }
        
        for(int i=1; i<500; i++) {
        	if(i == freq[i]) {
        		result = Math.max(result, i);
        	}
        }
        
        return result;
    }
}