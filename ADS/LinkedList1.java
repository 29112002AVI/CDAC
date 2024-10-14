/*
Single linked list.
[data]:[link]--->null//creation of node
Structure of node
class Node{
	int data;
	Node next;//object(ref)
	//square block is created.
	
	Node(int d)//value set
	{
		data = d;
		next = null;
	}
}
*/
class LinkedList1{
	
	Node head;
class Node{
	int data;
	Node next;//object(ref)
	//square block is created.
	
	Node(int d)//value set
	{
		data = d;
		next = null;//necessary to set null
	}
}	
	public static void main(String args[])
	{
		LinkedList1 l1 = new LinkedList1;
		l1.head = new Node(10);
		//matlab node 1 main ab data ki val hai 10;
		//l1.head = new Node(15);
		Node second = new Node(20);
		Node third = new Node(30);
		l1.head.next = second;
		second.next = third;
		
		
	}
	
}












