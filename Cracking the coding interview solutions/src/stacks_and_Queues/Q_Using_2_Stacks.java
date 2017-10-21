package stacks_and_Queues;
import java.util.Stack;

public class Q_Using_2_Stacks<T> {
	Stack<T> s1, s2;
	
public Q_Using_2_Stacks() {
	s1 = new Stack<T>();
	s2 = new Stack<T>();
}

public int size() {
	return s1.size() + s2.size();
}

public void add(T value) {
	s1.push(value);
}

public T peek() {
	if (!s2.empty()) return s2.peek();
	while (!s1.empty()) s2.push(s1.pop());
	return s2.peek();
}

public T remove() {
	if (!s2.empty()) return s2.pop();
	while (!s1.empty()) s2.push(s1.pop());
	return s2.pop();
}

public static void main(String[] args) {

	Stack s1 = new Stack();
	Stack s2 = new Stack();
	s1.push(10);
	s1.push(20);
	s1.push(30);
	s1.push(40);
	s1.push(50);
	s1.push(60);
	s1.push(70);
	System.out.println(s1);
	System.out.println(s1.peek());
	
}	

}
