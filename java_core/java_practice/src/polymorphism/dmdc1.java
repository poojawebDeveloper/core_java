package polymorphism;

public class dmdc1 {

	public static void main(String[] args) {


		p p1 = new c();
		p1.get();
		
	}

}
class p
{
	public void get()
	{
		System.out.println("parent method");
	}
}
class c extends p
{
	public void get()
	{
		System.out.println("child method");
	}
}