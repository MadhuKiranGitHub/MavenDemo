package linked_List;

public class Sum_Lists {
	
	private static Node sumLists(Node l1, Node l2, int carry){
		LinkedList resultList = new LinkedList();
		Node result=new Node();
		int val=carry;
		if(l1==null && l2==null && carry ==0)
			return null;
		
		if(l1!=null)
			val=val+l1.data;
			
		if(l2!=null)
			val=val+l2.data;
		
		result.data=val%10;
		//Recurse
		if(l1 !=null || l2 != null){
			Node more=sumLists(l1==null ? null : l1.next, 
								l2==null ? null : l2.next,
								val >= 10 ? 1:0 );			
			result.next=more;
		}
		
		return result;
	}
	
	private static LinkedList pushToList(int num1) {
		LinkedList list=new LinkedList();
		while(num1>0){
			int rem=num1%10;
			list.insertAtLast(rem);
			num1=num1/10;			
		}		
		return list;
	}		

	public static void main(String[] args) {
		LinkedList list1,list2,resultList = new LinkedList();
		Node resultHead;
		int num1=617;
		int num2=592;
		int carry=0;
		
		list1=pushToList(num1);
		list2=pushToList(num2);
		
		System.out.println("Your List-1 is "); list1.printList();
		System.out.println();
		System.out.println("Your List-2 is ");list2.printList();
		
		resultHead=sumLists(list1.head,list2.head,carry);
		Node temp=resultHead;
		System.out.println();
		System.out.println("Result List");
		while(temp !=null){
		
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	
	}

}
