package dsalab;

public class DoublyLinklist {
	// Node class
	static class Node {
		// Node class fields
		private int data;
		private Node next;
		private Node prev;
		// Node class methods
		public Node() {
			data = 0;
			next = null;
			prev = null;
		}
		public Node(int val) {
			data = val;
			next = null;
			prev = null;
		}
	}
	
	// class fields
	private Node head;
	
	// Constructor
	public DoublyLinklist() {
		head = null;
	}
	
	public void displayForward() {
		System.out.println("List: ");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data+" ->");
			trav = trav.next;
		}
		System.out.println();
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addLast(int val) {
		// create new node
		Node newNode = new Node(val);
		
		if(head == null) {
			head = newNode;
		}
		
		else {
			// traverse till last node
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = newNode;
			
			newNode.prev = trav;
		}
	}

	void addFirst(int val) {
		// create new node 
		Node newNode = new Node(val);
		
		if(isEmpty()) {
			head = newNode;
		}
		else {
			
			newNode.next = head;
			
			head.prev = newNode;
			head = newNode;
		}
	}

	public void delFirst() {
		
		if(head == null)
			throw new RuntimeException("List is empty.");
		
		if(head.next == null)
			head = null;
		
		else {
		
			head = head.next;
	
			head.prev = null;
		}
	}
	public void delAtPos(int pos) {
	
		if(pos == 1)
			delFirst();
		if(head == null || pos < 1)
			throw new RuntimeException("List is empty or Invalid position.");
		Node trav = head;

		for(int i = 1; i < pos; i++) {
			
			if(trav == null)
				throw new RuntimeException("Invalid position.");
			trav = trav.next;
		}
	
		trav.prev.next = trav.next;
		
		if(trav.next != null) 
			trav.next.prev = trav.prev;
		
	}
	public void displaylargeelement() {
		Node trav = head;
		int temp=0;
		while(trav != null) {
			if (trav.data >= temp) {
				temp = trav.data;
			}
			trav = trav.next;
		}
		System.out.println("Largest element are : "+temp);
	}

	public void displaysmallelement() {
		Node trav = head;
		int temp=trav.data;
		while(trav != null) {
			if (trav.data <= temp) {
				temp = trav.data;
			}
			trav = trav.next;
		}
		System.out.println("Smallest element are : "+temp);
	}
	
	public static void main(String[] args) {
      DoublyLinklist list = new DoublyLinklist();
      	list.addFirst(10);
      	list.addLast(20);
      	list.addLast(30);
      	list.addLast(40);
      	list.addLast(50);
      	list.addFirst(100);
      	list.displayForward();
      	System.out.println("AfterDeleting 2ND Node ");
      	list.delAtPos(2);
      	list.displayForward();
      	System.out.println("Display Large and Small Element in DLL");
      	list.displaylargeelement();
      	list.displaysmallelement();
      	
      	
		
	}
}
