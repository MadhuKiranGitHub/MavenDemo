package stacks_and_Queues;

import java.util.Stack;

public class Sort_Stack extends Stack<Integer>{

	public static Stack<Integer> sort(Stack<Integer> s) {
		 Stack<Integer> r = new Stack<Integer>();
		 while(!s.isEmpty()) {
			 int tmp = s.pop();
			 while(!r.isEmpty() && r.peek() > tmp) {
				 s.push(r.pop());
			 }
			 r.push(tmp);
		 }
		 return r;
		 
	}
	
	public static void main(String[] args) {
		Sort_Stack ss=new Sort_Stack();
		 Stack<Integer> s = new Stack<Integer>();
		 Stack<Integer> r = new Stack<Integer>();
		 s.push(1);
		 s.push(6);
		 s.push(4);
		 s.push(9);
		 s.push(7);
		 s.push(5);
		 System.out.println("Sorted stack is->"+s);
		 r= sort(s);
		 Integer atTop=r.peek();
		 System.out.println("Top element is->" + atTop);
		 System.out.println("Sorted stack is->" +r);
		 
	}
}
