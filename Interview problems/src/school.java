
public class school extends student{ 
final int val=14;


 school(){

	System.out.println(val);
}
void display(){
	System.out.println("nothing");
}

void display1(int i){
	System.out.println("val "+ i + "overloded");
}
	public static void main(String [] args){
		
		
		
		//studentA a1= new studentA();
		//System.out.println(a1.id+ " "+ a1.age);
		//a1.display();
		school sc=new school();

		//student stu=new student();
		sc.display();
		sc.display1(56);
	}
	
}
