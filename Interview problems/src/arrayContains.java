import java.util.ArrayList;

public class arrayContains {
	
	public void ifContains(int [] array, int key){
		for(int i=0;i< array.length;i++){
			if(array[i] == key){
				System.out.println("Key" + key+" found at : " +(i+1));
				return;
			}
		}
		System.out.println("key not found");
	}

	public void removeElement(int [] array, int key){
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i = 0; i <array.length;i++){
			al.add(array[i]);
			System.out.print("  " +al.get(i));
			
		}
		//int index=al.indexOf(key);
		//al.remove(index);
		al.add(676);
		al.add(1, 432);
		System.out.print("\n"+ al+ "  ");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayContains ac=new arrayContains();
		int [] array = {123,234,435,543,235};
		int key = 435;
		ac.ifContains(array, key);
		ac.removeElement(array, key);
	}

}
