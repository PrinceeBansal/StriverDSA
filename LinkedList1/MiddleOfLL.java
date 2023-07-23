package linked_list;

public class MiddleOfLL {
	
	 public ListNode middleNode(ListNode head) {
		 ListNode slow = head;
		 ListNode fast = head;
		 
		while(slow!=null) {
			if(fast.next==null) {  //wrote this condition first because fast.next should not be null for second condition
				return slow;     //otherwise null pointer exception
			}
			else if(fast.next.next==null) {
				return slow.next;
			}
			
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return head;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
