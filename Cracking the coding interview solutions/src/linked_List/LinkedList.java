package linked_List;

class Node {
	int data;
	Node next=null;
	
	Node(){
		
	}
	 Node(int d){
		data=d;
		this.next=null;
	}
}
	 
public class LinkedList{
	Node head;
	
	public void setHead(Node head) {
		this.head = head;
	}

	public Node getHead() {		
		return this.head;
	}

	public void insertAtLast(int data){
		Node temp=head;
		if(head == null){ //If list is Empty
			Node newnode = new Node(data);
			head = newnode;		
		}
		else{				
			while(temp.next != null){
				temp=temp.next;								
			}
			Node newnode = new Node(data);				
			temp.next = newnode;	
		}
	}

	public void insertAtFirst(int data){
		Node newnode = new Node(data);
		newnode.next=head;		
		head=newnode;
	}
	
	public void printList(){
		if(head == null){ 
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}

	public void delete(int data){
		if(head == null){ 
			System.out.println("List is empty");
			return;
		}
		
		Node temp=head;
		Node previous=null;
		
		while(temp!=null){
			if(temp.data!=data){
				previous=temp;
				temp=temp.next;			
			}
			else{
				previous.next=temp.next;
				return;
			}
		}
		System.out.println("data not found");
	}
	
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.insertAtLast(2);
		linkedlist.insertAtLast(4);
		linkedlist.insertAtLast(6);
		linkedlist.insertAtLast(8);
		linkedlist.insertAtLast(10);
		linkedlist.insertAtLast(12);
		linkedlist.insertAtLast(14);
		
		linkedlist.printList();
		//linkedlist.delete(6);
		//linkedlist.printList();
		

	}

}
 
	
	

