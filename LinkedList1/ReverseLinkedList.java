package linked_list;

public class ReverseLinkedList {
	
	//iterative method 
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode forward = null;
		ListNode temp = head;
		
		while(temp!=null) {
			forward = temp.next;
			temp.next = prev;
			prev = temp;
			temp = forward;
		}
		
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
