package linkedList2;
import java.util.PriorityQueue;

public class FlatteningLL {
	
	//for time & space complexity see notes in striver website
	Node flatten(Node root) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		Node temp = root;
		
		while(temp!=null) {
			Node dummy = temp;
			
			while(dummy!=null) {
				minHeap.add(dummy.data);
				dummy = dummy.bottom;
			}
			temp = temp.next;
		}
		
		Node head = null;
		Node prev = null;
		while(minHeap.peek()!=null) {
			Node newNode = new Node(minHeap.poll());
			if(prev==null) {
				head = newNode;
				prev = head;
			}
			else {
				prev.bottom = newNode;
				prev = newNode;
			}
		}
		prev.bottom = null;
		
		return head;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
