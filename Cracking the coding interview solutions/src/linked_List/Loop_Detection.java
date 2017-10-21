package linked_List;

public class Loop_Detection {

	public static Node detectLoop(Node head){
		Node slow=head;
		Node fast=head;
		
		while(fast !=null && fast.next != null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				break;
			}
		}
		
		while(fast == null || fast.next == null){
			return null;
		}
		slow=head;
		while(slow != fast){
			slow=slow.next;
			fast=fast.next;
		}
		
		return slow;
	}
	
	public static Node getNode(Node head, int n){
		Node node=head;
		if(head==null) return null;
		for(int i=0;i<n;i++){
			node=node.next;
		}
		return node;
	}
	public static void createLoop(Node head, int loopAt, int data){
		Node getLoopAt=getNode(head, loopAt);
		if(head == null) return;
		Node temp=head;
		while(temp.next != null){
			temp=temp.next;
		}
		Node newNode = new Node(data);
		temp.next=newNode;
		newNode.next=getLoopAt;
			
		
	}
	public static void main(String[] args) {
		int loopAt=2;
		int data=4;
		
		LinkedList list=new LinkedList();		
		list.insertAtLast(1);
		list.insertAtLast(2);
		list.insertAtLast(3);
		list.insertAtLast(5);
		list.insertAtLast(6);
		list.insertAtLast(7);
		list.insertAtLast(8);
		list.printList();
		
		//createLoop(list.head, loopAt, data);
		
		Node result=detectLoop(list.head);
		if(result==null){
			System.out.println("No loop detected");
		}else{
			System.out.println("Loop detected at"+ result.data);
		}
		
		
	}

}
