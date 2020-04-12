import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {
        boolean result = true;
        int size = 0;
        Stack<Integer> stack = new Stack<Integer>();
        ListNode temp = head;
        while(temp != null) {
        	size++;
        	temp = temp.next;
        }
        
        temp = head;
        int loop = size / 2;
        for(int i=0; i<loop; i++) {
        	stack.add(temp.val);
        	temp = temp.next;
        }
        
        if(size%2 != 0) {
        	temp = temp.next;
        	loop++;
        }
        
        while(temp != null) {
        	int top = stack.pop();
        	if(top != temp.val) {
        		result = false;
        		break;
        	}
        	
        	temp = temp.next;
        }
        
        return result;
    }
}