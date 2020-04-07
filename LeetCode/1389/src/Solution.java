import java.util.*;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
    	int len = nums.length;
    	int result[] = new int[len];
    	Arrays.fill(result, -1);
    	
    	for(int i=0; i<len; i++) {
    		if(result[index[i]] == -1) {
    			result[index[i]] = nums[i];
    		} else {
    			for(int j=len-2; j>=index[i]; j--) {
    				result[j+1] = result[j];
    			}
    			
    			result[index[i]] = nums[i];
    		}
    	}
    	
    	return result;
    }
}