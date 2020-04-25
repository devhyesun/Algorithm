import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
    	int len = nums.length;
    	List<Integer> list = new ArrayList<Integer>();
    	for(int i=0; i<len; i++) {
    		if(nums[i] != val) {
    			list.add(nums[i]);
    		}
    	}
    	
    	int size = list.size();
    	for(int i=0; i<size; i++) {
    		nums[i] = list.get(i);
    	}
    	
    	return size;
    }
}