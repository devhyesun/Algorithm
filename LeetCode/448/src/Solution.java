import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int len = nums.length;
        int[] check = new int[len+1];
        
        if(len < 1) { 
        	return list;
        }
        
        for(int i=0; i<len; i++) {
        	check[nums[i]]++;
        }
        
        for(int i=1; i<=len; i++) {
        	if(check[i] < 1) {
        		list.add(i);
        	}
        }
        
        return list;
    }
}