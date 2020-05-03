import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list; 
        List<Integer> tempList = new ArrayList<Integer>();
        
        if(numRows == 0) return result;
        
        int initEnd = (numRows == 1) ? 1 : 2;
        
        for(int i=0; i<initEnd; i++) {
        	list = new ArrayList<Integer>();
        	
        	for(int j=0; j<=i; j++) {
        		tempList.add(1);
    	        list.add(1);
        	}
        	
        	result.add(list);
        }
        
        int startIdx = 0;
        for(int i=2; i<numRows; i++) {
        	list = new ArrayList<Integer>();
        	list.add(1);
        	tempList.add(1);
        	
        	int a = 0;
        	int b = 0;
        	for(int j=2; j<=i; j++) {
        		a = (b==0) ? tempList.get(++startIdx) : b;
        		b = tempList.get(++startIdx);
        		
        		int sum = a+b;
        		tempList.add(sum);
        		list.add(sum);
        	}
        	
        	tempList.add(1);
        	list.add(1);
        	
        	result.add(list);
        }
        
        return result;
    }
}