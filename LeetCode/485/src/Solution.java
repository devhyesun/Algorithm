class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int result=0;
        int cnt=0;
        int len = nums.length;
        
        for(int i=0; i<len; i++) {
        	if(nums[i] == 1) {
        		cnt++;
        	} else {
        		result = Math.max(result, cnt);
        		cnt = 0;
        	}
        }
        
        result = Math.max(result, cnt);
        
        return result;
    }
}