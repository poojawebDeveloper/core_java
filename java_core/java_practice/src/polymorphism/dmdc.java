package polymorphism;

public class dmdc {

	public static void main(String[] args) {


		parent p= new child24();
		
	}

}
class parent
{
	public parent()
	{
		//get();
		System.out.println("paret");
	}
	public void get()
	{
		System.out.println("parentmethod");
	}
}
class child24 extends parent
{
	public child24()
	{
		System.out.println("child");
	}
	public void get()
	{
		System.out.println("child method");
	}
}