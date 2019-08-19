package weekFour;

public class LL {

		public static void main(String [] args) {
			
		}
}

public DLL {
	
	//Class var
	Node head;
	private int new_data; //head of list (by default this is node
	
	class Node{
		
		int data;
		Node prev;
		Node next;
		
		//Constructor to create a new mode
		//Next and previous is by default initialized as null
		
		Node(int d){
			data = d;
		}
			
	}
	
	//1. allocate node 2.put in the data
	
	Node new_node = new Node(new_data);
	Node last = head; //Used in step 5
	
	//3. This new node is going to be the last node, so make next of it as null
	
	new_node.next = null;
	
	//Of the linked list is empty, then make the new node as head
	if (head==null) {
		new_node.prev = null;
		head = new_node;
		return;
	}
	
	//5.Else traverse till the last node 
	while (last.next != null) {
			last = last.next;
			
	//6.Change the next of the last node
			last.next = new_node;
			
	//7. mark the last node as previous of new node
			new_node prev = last;
	}
}