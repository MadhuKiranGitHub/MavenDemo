package linked_List;

import linked_List.*;

public class Delete_Mid_Node {
	
	public static void deleteMidNode(Node pos){
		
		if(pos==null || pos.next==null){
			return;
		}
		else{
			pos.data=pos.next.data;
			pos.next=pos.next.next;
			return;
		}
		
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		int n=2;
		
		llist.insertAtLast(2);
		llist.insertAtLast(4);
		llist.insertAtLast(6);
		llist.insertAtLast(8);
		llist.insertAtLast(10);
		llist.insertAtLast(12);
		llist.insertAtLast(14);
		llist.printList();
		System.out.println();
		Node temp=llist.head;
		for(int i=1;i<=n;i++){
			temp=temp.next;
		}
		deleteMidNode(temp);
		System.out.println("after deleting node");
		llist.printList();
		
		

	}

}
