package abstraction;

public class a6 {

	public static void main(String[] args) {

		ani a= new tiger();
		a.eat();
		a.run();
	int j=	a.add(20, 30);
	System.out.println(j);
	System.out.println(a.add(40, 50));

		
	
	
	}

}
 abstract class ani
{
	 abstract public void eat();
	 abstract int add(int i,int y);
	 
	 public void run()
	 {
		 System.out.println("animal run");
	 }
}
 class tiger extends ani
 {

	@Override
	public void eat() {
		System.out.println("eat method of the abstract");
		
	}

	@Override
	int add(int i, int y) {


		return i+y;
	}
	 
 }
 
