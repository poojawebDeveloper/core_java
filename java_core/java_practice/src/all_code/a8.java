package all_code;

public class a8 {

	public static void main(String[] args) {


		banana b = new banana();
		b.dis();
		b.get();
		b.display();
	}

}
class fruit
{
	public void dis()
	{
		System.out.println("multilevel inhiritance");
		System.out.println("fruits list");
	}
}
class mango extends fruit
{
	public void get()
	{
		System.out.println("mango");
	}
}
class banana extends mango
{
	public void display()
	{
		System.out.println("banana");
	}
}