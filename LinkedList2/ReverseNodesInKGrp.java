package linkedList2;

public class ReverseNodesInKGrp {
	
	//
	public ListNode reverseKGroup(ListNode head, int k) {
		if(head==null || head.next==null) {return head;}
		int length = Length(head);
		
		ListNode temp = head;
		ListNode previousTail = null;
		ListNode tail = null;
		boolean lengthLeftFull = true;
		
		while(length >= k) {
			previousTail = tail;
			tail = temp;
			ListNode prev = null;
			ListNode forward = null;
			
			for(int i = 0; i < k; i++) {
				forward = temp.next;
				temp.next = prev;
				prev = temp;
				temp = forward;
			}
			
			if(lengthLeftFull) {
				head = prev;
			}
			else {
				previousTail.next = prev;
			}
			tail.next = forward;
			length = length - k;
			lengthLeftFull = false;
		}
		
		return head;
	}
	
	public int Length(ListNode head) {
		ListNode temp = head;
		int length = 0;
		
		while(temp!=null) {
			length++;
			temp = temp.next;
		}
		
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
