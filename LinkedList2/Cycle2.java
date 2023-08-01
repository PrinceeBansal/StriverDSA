package linkedList2;
import  java.util.HashSet;

public class Cycle2 {
	
	//space 0(N) time 0(N)
	public ListNode detectCycle(ListNode head) {
		HashSet<ListNode> set = new HashSet<>();
		ListNode temp = head;
		
		while(temp!=null) {
			if(set.contains(temp)) {
				return temp;
			}
			else {
				set.add(temp);
			}
			
			temp = temp.next;
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
