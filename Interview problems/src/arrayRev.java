
public class arrayRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={ 123,345,676};
		int arrlen=array.length-1;
		
		/*for(int i=0;i<array.length/2;i++){
			int temp = array[i];
			array[i]=array[arrlen-i];
			array[arrlen-i]=temp;
		}*/
		
		
		for(int i=arrlen;i>=0;i--){
			//int temp=array[i];
			System.out.print(" " + array[i]);
		}
		
	}

}
