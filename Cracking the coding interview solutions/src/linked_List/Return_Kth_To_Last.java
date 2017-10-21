package linked_List;



import linked_List.*;

public class Return_Kth_To_Last {
	
	public static Node kthToLast(Node head,int k ){
		LinkedList llist = new LinkedList();
		Node p1=head;
		Node p2=head;
		int i=0;
		while( i <= k ){
			if(p2==null){
				return null;
			}
			p2=p2.next;
			i++;			
		}
		while(p2 !=null){
			p1=p1.next;
			p2=p2.next;
		}
		
		return p1;
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		int k=2;
		
		llist.insertAtLast(2);
		llist.insertAtLast(4);
		llist.insertAtLast(6);
		llist.insertAtLast(8);
		llist.insertAtLast(10);
		llist.insertAtLast(12);
		llist.insertAtLast(14);
		llist.printList();
		
		Node p=kthToLast(llist.head,k);
		System.out.println("kth to last contains--> " +p.data);
		

	}

}
