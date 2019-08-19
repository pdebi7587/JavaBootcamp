package weekFour;
public class LinkedList {
	
	static int size = 0;
	static Node head,tail;
	public static void main(String [] args) {
		
		head = new Node("head");
		tail = new Node("tail");
		head.next = tail;
		tail.prev = head;
		
		
		LinkedList ll = new LinkedList();
		for (int i=1; i<11; i++) {
			ll.add(Integer.toString(i));
			size++;
		}
		
		ll.add("7");
		
		System.out.println("size: " + ll.size);
		ll.print();
			
	}
	
	public void add(String data) {
		Node temp = new Node(data);
		Node tempTailPrev = tail.prev;
		tempTailPrev.next = temp;
		temp.prev = tempTailPrev;
		temp.next = tail;
		tail.prev = temp;
	}
	
	public void print() {
		Node temp = head;
		while (temp.next != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

}

class Node {
	Node next, prev;
	String data;
	
	public Node() {
		next = null;
		prev = null;
		data = "";
		
	}
	
	public Node(String data) {
		next = null;
		prev = null;
		this.data = data;
		
	}
}
