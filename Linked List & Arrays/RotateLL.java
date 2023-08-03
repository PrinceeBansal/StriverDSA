package linkedList_Arrays;

public class RotateLL {
	
	//Brute  force - time 0(no. of nodes*k) TLE because what if k = 20,000
	public ListNode rotateRight(ListNode head, int k) {
		if(head==null || head.next==null) {return head;}
		
		for(int i = 0; i < k; i++) {
			ListNode temp = head;
			
			while(temp.next.next!=null) {
				temp = temp.next;
			}
			
			ListNode forward = temp.next;
			temp.next = null;
			forward.next = head;
			head = forward;
		}
		
		return head;
	}
	
	//optimised
	public ListNode rotateRight2(ListNode head, int k) {
		if(head==null || head.next==null) {return head;}
		
		int length = Length(head);
		if(k == length || k==0) {return head;}
		if(k > length) {k = k%length;}
		
		for(int i = 0; i < k; i++) {
			ListNode temp = head;
			
			while(temp.next.next!=null) {
				temp = temp.next;
			}
			
			ListNode forward = temp.next;
			temp.next = null;
			forward.next = head;
			head = forward;
		}
		
		return head;
	}
	
	public int Length(ListNode head) {
		int length = 0;
		ListNode temp = head;
		
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
