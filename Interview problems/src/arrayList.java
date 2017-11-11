import java.util.*;

public class arrayList {

	
public static void main(String []args)
{
	ArrayList<String> list = new ArrayList<String>();
	list.add("AAA");
	list.add("BBB");
	list.add("CCC");
	
	ArrayList<String> list2= new ArrayList<String>();
	list2.add("Sanam");
	list2.add("Shagun");
	list2.add("AAA");
	list2.addAll(list);
	list2.remove("AAA");
	list2.retainAll(list);
	
	Iterator it= list2.iterator();
	
	//while(it.hasNext()){
	for(String s:list2){	
	System.out.println(it.next());
	}
	
}
	
}
