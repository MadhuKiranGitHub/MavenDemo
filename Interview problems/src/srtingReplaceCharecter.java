
public class srtingReplaceCharecter {
	//Replace letter l with z
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Hello World";
		char[] arr= string.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='l'){
				arr[i]='z';
			}
		}
		for(int i = 0; i < arr.length;i++){
			System.out.println("\tArray:  "+ arr[i]);
		}
	}

}
