package linked_List;

	// Java program to remove duplicates from unsorted linked list
	 
	public class Remove_Duplicate_From_Unsorted_LinkedList {
	 
	    static Node head;
	 
//	    static class Node {
//	 
//	        int data;
//	        Node next;
//	 
//	        Node(int d) {
//	            data = d;
//	            next = null;
//	        }
//	    }
	 
	    /* Function to remove duplicates from an
	       unsorted linked list */
	    void remove_duplicates() {
	        Node ptr1 = null, ptr2 = null, dup = null;
	        ptr1 = head;
	 
	        /* Pick elements one by one */
	        while (ptr1 != null && ptr1.next != null) {
	            ptr2 = ptr1;
	 
	            /* Compare the picked element with rest
	                of the elements */
	            while (ptr2.next != null) {
	 
	                /* If duplicate then delete it */
	                if (ptr1.data == ptr2.next.data) {
	 
	                    /* sequence of steps is important here */
	                    dup = ptr2.next;
	                    ptr2.next = ptr2.next.next;
	                    System.gc();
	                } else /* This is tricky */ {
	                    ptr2 = ptr2.next;
	                }
	            }
	            ptr1 = ptr1.next;
	        }
	    }
	 
	    void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
	    public static void main(String[] args) {
	    	Remove_Duplicate_From_Unsorted_LinkedList list = new Remove_Duplicate_From_Unsorted_LinkedList();
	        list.head = new Node(10);
	        list.head.next = new Node(12);
	        list.head.next.next = new Node(11);
	        list.head.next.next.next = new Node(11);
	        list.head.next.next.next.next = new Node(12);
	        list.head.next.next.next.next.next = new Node(11);
	        list.head.next.next.next.next.next.next = new Node(10);
	 
	        System.out.println("Linked List before removing duplicates : \n ");
	        list.printList(head);
	 
	        list.remove_duplicates();
	        System.out.println("");
	        System.out.println("Linked List after removing duplicates : \n ");
	        list.printList(head);
	    }
	}
//	class Node{
//		int data;
//		Node next=null;
//	
//		Node(int data){
//			this.data=data;
//			this.next=null;
//		}
//	}
//
//	public  class LinkedList{
//		Node head;
//		void push(int data){
//			Node newnode = new Node(data);
//			newnode.next=head;		
//			head=newnode;
//		}
//		
//		void printList(){
//			Node temp=head;
//			while(temp!=null){
//				System.out.println(temp.data);
//				temp = temp.next;
//			}
//		}
//		
//		void deleteDuplicate(){
//			Node ptr1 = null, ptr2 = null, dup = null;
//	        ptr1 = head;
//	 
//	        /* Pick elements one by one */
//	        while (ptr1 != null && ptr1.next != null) {
//	            ptr2 = ptr1;
//	 
//	            /* Compare the picked element with rest
//	                of the elements */
//	            while (ptr2.next != null) {
//	 
//	                /* If duplicate then delete it */
//	                if (ptr1.data == ptr2.next.data) {
//	 
//	                    /* sequence of steps is important here */
//	                    dup = ptr2.next;
//	                    ptr2.next = ptr2.next.next;
//	                    System.gc();
//	                } else /* This is tricky */ {
//	                    ptr2 = ptr2.next;
//	                }
//	            }
//	            ptr1 = ptr1.next;
//	        }
//	    }
//			
//		
//	
//	
//	public void main(String[] args) {
//		/*
//		 * With temp buffer--Hash table
//		 */
//		
//		LinkedList linkedlist = new LinkedList();
//		linkedlist.push(5);
//		linkedlist.push(2);
//		linkedlist.push(1);
//		linkedlist.push(4);
//		linkedlist.push(2);
//		linkedlist.push(4);
//		linkedlist.push(5);
//		linkedlist.printList();
//		linkedlist.deleteDuplicate();
//		System.out.println("after removing duplicates");
//		linkedlist.printList();
//
//	}
//	}


