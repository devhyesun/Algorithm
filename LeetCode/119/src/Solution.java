import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>(rowIndex + 1);
        List<Integer> tempList = new ArrayList<Integer>();
        tempList.add(1);
        tempList.add(1);
        tempList.add(1);
        
        int startIdx = 0;
        for(int i=2; i<=rowIndex; i++) {
        	tempList.add(1);
        	
        	int a = 0;
        	int b = 0;
        	for(int j=2; j<=i; j++) {
        		a = (b==0) ? tempList.get(++startIdx) : b;
        		b = tempList.get(++startIdx);
        		
        		int sum = a+b;
        		tempList.add(sum);
        	}
        	
        	tempList.add(1);
        }
        
        int size = tempList.size();
        for(int i=size-rowIndex-1; i<size; i++) {
        	result.add(tempList.get(i));
        }
        
        return result;
    }
}