package linked_list;

public class RemoveNthNode {
	
	//Time 0(N), space const
	 public ListNode removeNthFromEnd1(ListNode head, int n) {
		 int length = 0;
		 
		 ListNode temp = head;
		 while(temp!=null) {
			 length++;
			 temp = temp.next;
		 }
		 
		 int position = length-n;
		 
		 if(position==0) {
			 head = head.next;
			 return head;
		 }
		 
		 int count = 0;
		 temp = head;
		 while(temp!=null) {
			 count++;
			 
			 if(count==position) {
				 if(temp.next!=null) {
					 ListNode ref = temp.next.next;
					 temp.next = ref;
					 break;
				 }
			 }
			 
			 temp = temp.next;
		 }
		 
		 return head;
	 }
	 
	 
	 //2 pointer
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 ListNode start = new ListNode();
		 start.next = head;   //attaching at start of list dummy node
		 ListNode fast = head;
		 ListNode slow = start;  //because in while loop we need to reach nth node from end-1 to manipulate connections 
		                 //otherwise if we start slow from head we reach nth node from end in while loop
		 for(int i = 1; i < n; i++) {
			 fast = fast.next;
		 }
		 
		 while(fast.next!=null) {
			 fast = fast.next;
			 slow = slow.next;
		 }
		 
		 slow.next = slow.next.next;  //slow.next is never null because slow is pointing to nth -1 node from end and n is always at least 1 according to constraints
		 
		 return start.next;  //works for even if n=1 and head changes
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
