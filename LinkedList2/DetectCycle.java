package linkedList2;
import java.util.HashSet;

public class DetectCycle {
	
	//time limit exceeded for this soln
	public boolean hasCycle(ListNode head) {
		int length = 0;
		int pos = 0;
		
		ListNode temp = head;
		while(temp!=null) {
			length++;
			temp = temp.next;
		}
		
		temp = head;
		while(temp!=null) {
			pos++;
			if(pos==length) {
				if(temp.next==null) {return false;}
				else {return true;}
			}
			temp = temp.next;
		}
		
		return false;
	}
	
	
	//solution of hashing both time and space 0(N)
	public boolean hasCycle2(ListNode head) {
		HashSet<ListNode> set = new HashSet<>();
		ListNode temp = head;
		
		while(temp!=null) {
			if(set.contains(temp)) {
				return true;
			}
			
			set.add(temp);
			temp = temp.next;
		}
		
		return false;
	}
	
	
	// fast slow approach
	public boolean hasCycle3(ListNode head) {
		if(head==null) {return false;}
		ListNode fast = head;
		ListNode slow = head;
		
		
		while(fast.next!=null && fast.next.next!=null) { //wrote second condition because without it fast could've been null and then when while condition evaluated null.next error so in this now fast can never be null, if fast has the possibility of being null that is if no cycle then loop will break and return false
			slow = slow.next;
			fast = fast.next.next;
			
			if(fast==slow) {
				return true;
			}
			
		}
		
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
