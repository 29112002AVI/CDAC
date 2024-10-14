public class SinglyLL{
Node head;

class Node{
private int data;
Node next; 

public Node(int data){
	this.data=data;
	this.next=null;
}

}
public void addFirst(int d){
	Node new_node= new Node(d);
	
	if(head==null){
		head=new_node;
		return;
	}
	new_node.next=head;
	head=new_node;
}


public void addLast(int d){
	Node new_node= new Node(d);
	
	if(head==null){
		head=new_node;
		return;
	}

	Node prev_node=head;
	while(prev_node.next!=null){
		prev_node=prev_node.next;
	}
	prev_node.next=new_node;
	
}

public void display(){
	if(head==null){
		System.out.println("List is empty");
		return;
	}
	Node list=head;
	while(list!=null){
		System.out.print(list.data+"-->");
		list=list.next;
	}
	System.out.println("null");
	
}

public static void main(String args[]){
SinglyLL s=new SinglyLL();
s.addFirst(10);
s.addFirst(20);
s.addFirst(30);
s.addLast(50);
s.display();
}
}