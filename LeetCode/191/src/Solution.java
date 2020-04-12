public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    	int result = 0;
    	
    	String num = Integer.toBinaryString(n);
    	int len = num.length();
    	
    	for(int i=0; i<len; i++) {
    		char ch = num.charAt(i);
    		if(ch == '1') result++;
    	}
        
        return result;
    }
    
    /*
    public int hammingWeight(int n) {
    	return Integer.bitCount(n);
    }
    */
}