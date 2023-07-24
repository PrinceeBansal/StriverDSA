package linked_list;

public class Merge2SortedLists {
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if(list1==null && list2!=null) {  //condition imp to handle leetcode testcase 2
			return list2; 
		}
		else if(list1!=null && list2==null) {
			return list1;
		}
		
		ListNode t1 = list1;
		ListNode t2 = list2;
		ListNode head = null;
		ListNode tail = null;
		
		while(t1!=null && t2!=null) {
			
			if(t1==list1 && t2==list2) {
				if(t1.val < t2.val) {
					head = t1;
					tail = t1;
					t1 = t1.next;
				}
				else if(t2.val < t1.val) {
					head = t2;
					tail = t2;
					t2 = t2.next;
				}
				else {
					head = t1;
					tail = t1;
					t1 = t1.next;
				}
			}
			
			else {
				if(t1.val < t2.val) {
					tail.next = t1;
					tail = t1;
					t1 = t1.next;
				}
				else if(t2.val < t1.val) {
					tail.next = t2;
					tail = t2;
					t2 = t2.next;
				}
				else {
					tail.next = t1;
					tail = t1;
					t1 = t1.next;
				}
			}
			
		}
		
		if(t1==null && tail!=null) {  //tail condition necessary to handle empty list case (leetcode test case 3)
			tail.next = t2;
		}
		else if(t2==null && tail!=null) {
			tail.next = t1;
		}
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
