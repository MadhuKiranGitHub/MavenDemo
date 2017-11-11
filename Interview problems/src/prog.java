
public class prog implements emp {

	
	public void display()
	{
		System.out.println("inside prog class");
	}
	
	public void display(int n)
	{
		int val=n;
		System.out.println("val"+ val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emp p=new prog();
		p.display();
		//p.display(5);
		

	}

}
