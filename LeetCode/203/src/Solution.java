class Solution {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) return null;
		
		ListNode back = head;
		
		while (back.val == val){
			head = back.next;
			back = head;
			if(back == null) return null;
		}
		
		ListNode front = head.next;
		
		while(front != null){
			if(front.val == val){
				back.next = front.next;
				front = front.next;
			} else {
				back = front;
				front = front.next;
			}
		}
		
		return head;
	}
}