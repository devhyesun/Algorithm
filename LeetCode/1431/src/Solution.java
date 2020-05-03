import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    	int len = candies.length;
    	List<Boolean> result = new ArrayList<Boolean>(len);
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<len; i++) {
        	max = Math.max(max, candies[i]);
        }
        
        for(int i=0; i<len; i++) {
        	int sum = candies[i] + extraCandies;
        	
        	result.add(sum>=max);
        }
        
        return result;
    }
}