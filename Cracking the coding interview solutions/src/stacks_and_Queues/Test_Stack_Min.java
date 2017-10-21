package stacks_and_Queues;

public class Test_Stack_Min {
	

	public static void main(String[] args) {
		Stack_Min sm=new Stack_Min();
		sm.push(6);
		sm.push(5);
		sm.push(8);
		sm.push(9);

		System.out.println("Top os stack contains="+ sm.pop().value+ " : Min Value in stack is=" +sm.pop().min);
		System.out.println();
	}

}
