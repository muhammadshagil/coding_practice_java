package linkedlist;

//1) If Linked list is empty then make the node as
//head and return it.
//2) If value of the node to be inserted is smaller 
//than value of head node, then insert the node 
//at start and make it head.
//3) In a loop, find the appropriate node after 
//which the input node (let 9) is to be inserted. 
//To find the appropriate node start from head, 
//keep moving until you reach a node GN (10 in
//the below diagram) who's value is greater than 
//the input node. The node just before GN is the
//appropriate  node (7).
//4) Insert the node (9) after the appropriate node
//(7) found in step 3.

public class LinkedList {
	// head of linked list
	Node head;

	// Class Node
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// function to create a new node
	public Node newNode(int data) {
		return new Node(data);
	}

	// function to insert a new node into list
	public void instertSortedList(Node inputNode) {
		if (head == null || head.data > inputNode.data) {
			inputNode.next = head;
			head = inputNode;
		} else {
			Node current = head;
			while (current.next != null && current.next.data < inputNode.data)
				current = current.next;
			inputNode.next = current.next;
			current.next = inputNode;
		}
	}
	
	public void deleteNode(Node node){
		if(head!=null && head == node) {
			if(head.next == null) {
				System.out.println("list contains only one node. it cannot be deleted");
				return;
			}
			
			head.data = head.next.data;
			head.next = head.next.next;
			System.gc();
			return;
		}
		Node prev = head;
		while(prev.next!=null && prev.next != node) {
			prev = prev.next;
		}
		if(prev.next== null) {
			System.out.println("given node is not exist in list");
			return;
		}
		
		prev.next = prev.next.next;
		System.gc();
		return;
	}

	// print LinkedList
	public String printList() {
		Node current = head;
		StringBuilder listString = new StringBuilder();
		while (current != null) {
			listString.append(current.data);
			listString.append("<");
			current = current.next;
		}
		return listString.toString();
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.instertSortedList(linkedList.newNode(5));
		linkedList.instertSortedList(linkedList.newNode(4));
		linkedList.instertSortedList(linkedList.newNode(7));
		linkedList.instertSortedList(linkedList.newNode(10));
		linkedList.instertSortedList(linkedList.newNode(2));
		linkedList.instertSortedList(linkedList.newNode(9));
		System.out.println(linkedList.printList());
		
		
		
		linkedList.deleteNode(linkedList.head.next.next.next.next.next);
		System.out.println(linkedList.printList());

	}

}
