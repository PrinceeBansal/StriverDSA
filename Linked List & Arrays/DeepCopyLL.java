package linkedList_Arrays;
import java.util.HashMap;

public class DeepCopyLL {
	
	//BruteForce
	public Node copyRandomList(Node head) {
		HashMap<Node,Node> map = new HashMap<>();
		
		Node temp = head;
		while(temp!=null) {
			Node newnode = new Node(temp.val);
			map.put(temp, newnode);
			temp = temp.next;
		}
		
		Node temp1 = head;
		while(temp1!=null) {
			Node t = map.get(temp1);
			t.next = map.get(temp1.next);
			t.random = map.get(temp1.random);
			temp1 = temp1.next;
		}
		
		return map.get(head);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
