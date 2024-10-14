class Linkedlist2{
	
	Node head;
	
static class Node{
	int data;
	Node next;//object(ref)
	//square block is created.
	
	Node(int d)//value set
	{
		data = d;
		next = null;//necessary to set null
	}
}	

	void disp()
	{
		//create new pointer to display
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data + "--->");
			n= n.next;
		}
		void insert(int new_data)
		{
			Node new_node = new Node(new_node);
			new_node.next = head;
		}
	}
	public static void main(String args[])
	{
		Linkedlist2 l1 = new Linkedlist2();
		l1.head = new Node(10);
		//matlab node 1 main ab data ki val hai 10;
		//l1.head = new Node(15);
		Node second = new Node(20);
		Node third = new Node(30);
		l1.head.next = second;
		second.next = third;
		l1.disp();
		System.out.println();
		l1.inset(40);
		l1.insert(50);
		l1.disp();
		
		
	}
	
}
