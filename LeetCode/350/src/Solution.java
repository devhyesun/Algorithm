import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int len = nums1.length;
        for(int i=0; i<len; i++) {
        	map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        
        len = nums2.length;
        for(int i=0; i<len; i++) {
        	if(map.getOrDefault(nums2[i], 0) > 0) {
        		list.add(nums2[i]);
        		map.put(nums2[i], map.getOrDefault(nums2[i], 0) - 1);
        	}
        }
        
        int size = list.size();
        int[] result = new int[size];
        for(int i=0; i<size; i++) {
        	result[i] = list.get(i);
        }
        
        Arrays.sort(result);
        
        return result;
    }
}