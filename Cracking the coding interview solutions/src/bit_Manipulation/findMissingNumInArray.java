package bit_Manipulation;

import java.util.Vector;

public class findMissingNumInArray {
	static int col = 31;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> a = new Vector<Integer>(10);
		a.add(1);a.add(2);a.add(0);a.add(4);a.add(3);
		a.add(5);
		//a.add(7);a.add(8);a.add(9);
		System.out.println(findnum(a)); 
	}

	private static int findnum(Vector<Integer>a) {
		// TODO Auto-generated method stub
		if(a.isEmpty()) return 0;
		int ans = 0;
		Vector<Integer> bitone = new Vector<Integer>(10);
		Vector<Integer> bitzero = new Vector<Integer>(10);
		for(int i=0;i<a.size();i++){
			if(fetchbit(a,i,col)){
				bitone.add(a.get(i));
			}
			else{
				bitzero.add(a.get(i));
			}
		}
		
		if(bitzero.size()<=bitone.size()){// the last bit of ans should be 0
			col--;ans = (findnum(bitzero)<<1);
		}
		else{//bitone<=bitzero the last bit of ans should be 1
			col--;ans = ((findnum(bitone)<<1)|1);
			
		}
		System.out.println(Integer.toBinaryString(ans));
		return ans;
	}

	private static boolean fetchbit(Vector<Integer> a, int i, int j) {
		// TODO Auto-generated method stub
		Integer tmp = a.get(i);
		return (((tmp.intValue()>>(31-j))&1)!=0);
	}
}
