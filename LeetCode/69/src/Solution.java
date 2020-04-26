class Solution {
    public int mySqrt(int x) {
        int cnt=0;
        int temp = x;
        
        while(temp != 0) {
        	cnt++;
        	temp /= 10;
        }
        
        cnt--;
        
        long start = (int) Math.pow(10, cnt/2);
        long d = start * start;
        while(d <= x) {
        	if(d == x) {
        		return (int)start;
        	}
        	
        	start++;
        	d = start * start;
        }
        
        return (int)start-1;
        
    }
}