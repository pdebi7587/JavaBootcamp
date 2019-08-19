package weekFour;

public class nodes {

	 Node head;
	 Node tail;
	 int size = 0;
	
	static class Node {
		//data
		int data;
		
		//next node in the list
		Node next;
		
		//previous node in the list
		Node prev;
		
		Node(int data){
			this.data = data;
		}
		
		public void displayData() {
			System.out.print(" " + data);
		}
	}
	
	//constructor for list
	public nodes() {
		this.head = null;
		this.tail = null;
	}
	
	//method to check if the list is empty
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insertFirst(int data) {
		//Create a new node
		Node newNode = new Node(data);
		
		//if first insertion, tail should also print to this node
		
		if (isEmpty()) {
			tail = newNode;
		}
		
		else {
			head.prev = newNode;
		}
		
		newNode.next = head; //head before insertion
		head = newNode; //head after insertion
		size++;
		
	}
	
	public void insertLast(int data) {
		
		//Create a new node
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		}
		
		else {
			tail.next = newNode;
			newNode.prev = tail;
		}
		
		tail = newNode;
		size++;
	}
	
	private boolean isValidPosition(int position) {
		return position >= 1 && position <= size+1;
	}
	
	public void insertAtPosition(int data,int position) {
		
		//check if it is a valid position to add, else return
		if (!isValidPosition(position)) {
			System.out.println("Not a valid position");
		}
		
		if (position == 1) {
			insertFirst(data);
		}
		
		//Insert at the start
		else if (size == position-1) {
			insertLast(data);
			
		}
		//insert in any other valid position
		else {
			//Find the node before which you want to add new node
			// and set it to current
			
			//Create a node object
			Node newNode = new Node(data);
			
			//Set current to head
			Node current = head;
			
			int currentPos = 1;
			
			while(currentPos < position-1) {
				currentPos++;
				current = current.next;
			}
			
			newNode.next = current.next;
			current.next.prev = newNode;
			current.next = newNode;
			newNode.prev = current;
			size++;
		}
		
		//1.Set next to new node to current
		//2.Find the previous node before current and set the next of it to new node
		//3.Set the previous node of the new node to the previous node of the current node
		//4.Set the previous node of current node to the new node
		//5.Update the size
			
	}
	
	public void deleteFirst() {
		
		if (isEmpty()) {
			System.out.println("Is empty!");
			return;
		}
		
		if (!isEmpty()) {
			
			if (head == tail) {
				head = null;
				tail = null;
				size--;
				return ;
			}
			
			else {
				head = head.next;
				head.prev = null;
				size--;
			}
		}
			
	}
	
	public void deleteLast() {
		
		if (!isEmpty()) {
			
			if (tail.prev == null && head.next == null) {
				tail = null;
				head = null;
				size--;
				return;
			}
			
			else {
			Node current = tail;
				
			tail = current.prev;
			tail.next = null;
			size--;
			
			}
		}
		
		else {
			System.out.println("List is already empty!");
			return ;
		}	
		
	}
	
	
	public void deletePosition(int position) {
		
		if (!isEmpty() && size >= position ) {
		
		if (position == 1) {
			deleteFirst();
		}
		
		else if (position == size) {
			deleteLast();
		}
		
		else {
			Node current = head;
			
			int currentPos = 1;
			
			while(currentPos < position) {
				currentPos++;
				current = current.next;
				
			}
			
				current.next.prev = current.prev;
				current.prev.next = current.next;
				size--;		
		}
		}
		
		else {
			System.out.println("Is empty or invalid position!");
		}
		
		
		
	}
	
	public void displayForward() {
		Node current = head;
		while (current != null) {
			current.displayData();
			current = current.next;
		}
		System.out.println("");
	}
	
	
	
	public void displayBackward () {
		Node current = tail;
		
		while (current != null) {
			current.displayData();
			current = current.prev;
		}
		System.out.println(" ");
	}
	public static void main(String [] args) {
		nodes list = new nodes();
		list.insertFirst(1);
		list.insertFirst(2);
		//list.displayForward();
		list.insertLast(98);
		list.insertLast(99);
		list.insertLast(100);
		list.insertAtPosition(5,3);
		list.insertAtPosition(10,4);
		list.deleteFirst();
		list.deleteLast();
		list.deletePosition(4);
		list.displayForward();
		list.displayBackward();
		
		
	}
}


