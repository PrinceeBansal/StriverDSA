package linked_list;

public class Add2Nos {

	
	//optimal soln
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode start = new ListNode();
		 ListNode temp = start;
		 int carry = 0;
		 
		 while(l1!=null || l2!=null || carry!=0) {
			 int sum = 0;
			 
			 if(l1!=null) {
				 sum = l1.val;
				 l1 = l1.next;
			 }
			 if(l2!=null) {
				 sum += l2.val;
				 l2 = l2.next;
			 }
			 
			 sum += carry;
			 carry = sum/10;  //new value of carry
			 ListNode newNode = new ListNode(sum%10);
			 temp.next = newNode;
			 temp = newNode;
		 }
		 
		 return start.next;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
