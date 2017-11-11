import java.util.Iterator;
import java.util.LinkedList;
public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(2);
		li.add(4);
		li.addFirst(1);
		li.addLast(6);
		li.add(2);
		
		 Iterator i=li.iterator();
		 
		 while(i.hasNext()){
			 
			 System.out.println(i.next());
		 }
		 int last=li.indexOf(2);
		 System.out.println(last);
	}

}
