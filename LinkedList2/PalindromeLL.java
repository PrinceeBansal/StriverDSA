package linkedList2;
import java.util.ArrayList;

public class PalindromeLL {
	
	//Brute force time and space 0(N)
	public boolean isPalindrome(ListNode head) {
		ArrayList<Integer> arr = new ArrayList<>();
		ListNode temp = head;
		
		while(temp!=null) {
			arr.add(temp.val);
			temp = temp.next;   //0(N)
		}
		
		for(int i = 0; i <= arr.size()/2; i++) {
			if(arr.get(i)!=arr.get(arr.size()-i-1)) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	//optimised time = 0(N/2) + 0(N/2)+0(N/2), space const
	public boolean isPalindrome2(ListNode head) {
		if(head==null || head.next==null) {
			return true;
		}
		
		ListNode midNode = midpoint(head);
		ListNode headReverse = reverseLL(midNode.next);
		midNode.next = headReverse;
		ListNode dummy = head;
		
		while(dummy!=null && headReverse!=null) {
			if(dummy.val != headReverse.val) {
				return false;
			}
			
			dummy = dummy.next;
			headReverse = headReverse.next;
		}
		
		return true;
	}
	
	public ListNode midpoint(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		
		while(slow!=null) {
			if(fast.next==null) {
				return slow;    //we are doing this deliberately otherwise odd length LL mein problem
			}
			
			if(fast.next.next==null) {
				return slow;
			}
			
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	public ListNode reverseLL(ListNode head) {
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
