import java.util.*;

class Solution {
    public int maximumProduct(int[] nums) {
        int result = 0;
        int len = nums.length;
        Arrays.sort(nums);
        
        result = nums[len-1] * nums[len-2] * nums[len-3];
        
        if(nums[1] >= 0) {
        	return result;
        } else {
        	return Math.max(result, nums[0]*nums[1]*nums[len-1]);
        }
    
    }
}