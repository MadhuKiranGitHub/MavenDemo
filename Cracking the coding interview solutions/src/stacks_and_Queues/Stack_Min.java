package stacks_and_Queues;

import java.util.Stack;

public class Stack_Min extends Stack<minNode>{
	public void push(int val){
		int newMin=Math.min(min(), val);
		super.push(new minNode(val,newMin));
	}
	
	public int min(){
		if(isEmpty()){
			return 9999;
		}
		else{
			return peek().min;
		}
	}
}
