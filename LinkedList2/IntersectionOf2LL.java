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
	
	
	//Difference in length, time 0(N)  space const longer code
	public int DifferenceLength(ListNode headA, ListNode headB) {
		int length1 = 0;
		int length2 = 0;
		
		ListNode temp1 = headA;
		while(temp1!=null) {
			length1++;
			temp1 = temp1.next;
		}
		
		ListNode temp2 = headB;
		while(temp2!=null) {
			length2++;
			temp2 = temp2.next;
		}
		
		return length1-length2;  //if difference +ve ll1>ll2
	}
	
	public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
		int difference = DifferenceLength(headA, headB);
		ListNode dummy1 = headA;
		ListNode dummy2 = headB;
		
		if(difference>0) {
			while(difference!=0) {
				dummy1 = dummy1.next;
				difference--;
			}
		}
		else {
			while(difference!=0) {
				dummy2 = dummy2.next;
				difference++;
			}
		}
		
		while(dummy1!=null && dummy2!=null) {
			if(dummy1==dummy2) {
				return dummy1;
			}
			dummy1 = dummy1.next;
			dummy2 = dummy2.next;
		}
		
		return null;
	}
	
	
	
	//shorter method shorter code same complexities as above
	public ListNode getIntersectionNode4(ListNode headA, ListNode headB) {
		ListNode d1 = headA;
		ListNode d2 = headB;
		
		while(d1!=d2) {
			if(d1==null) {
				d1 = headB;
			}
			else {
				d1 = d1.next;
			}
			if(d2==null) {
				d2 = headA;
			}
			else {
				d2 = d2.next;
			}
		}
		
		return d1;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
