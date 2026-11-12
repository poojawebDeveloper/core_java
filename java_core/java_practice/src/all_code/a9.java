package all_code;

public class a9 {

	public static void main(String[] args) {

		System.out.println("hierarchical inheritance");
		crow c = new crow();
		c.get();
		c.dis();

		peacock p = new peacock();
		p.get();
		p.display();
	}

}
class bird
{
	public void get()
	{
		System.out.println("this is bird");
	}
}
class crow extends bird
{
	public void dis()
	{
	System.out.println("crow");
	}
}
class peacock extends bird
{
	public void display()
	{
		System.out.println("peacock");
	}
}