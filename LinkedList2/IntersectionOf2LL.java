package linkedList2;
import java.util.HashSet;

public class IntersectionOf2LL {
	
	//time 0(M*N) space const
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode temp1 = headA;
		
		while(temp1!=null) {
			
			ListNode temp2 = headB;
			while(temp2!=null) {
				if(temp2==temp1) {
					return temp1;
				}
				temp2 = temp2.next;
			}
			
			temp1 = temp1.next;
		}
		
		return null;
	}
	
	
	//hashing time 0(N) space 0(N)
	public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
		HashSet<ListNode> set = new HashSet<>();
		ListNode temp = headA;
		
		while(temp!=null) {
			set.add(temp);
			temp = temp.next;
		}
		
		ListNode temp2 = headB;
		while(temp2!=null) {
			if(set.contains(temp2)) {
				return temp2;
			}
			temp2 = temp2.next;
		}
		
		return null;
	}
	
	
	//Difference in length
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
