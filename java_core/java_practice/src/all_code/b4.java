package all_code;

public class b4 {

	public static void main(String[] args) {

		child c = new child();
		c.get();

	}

}
class overriding
{
	public void get()
	{
		System.out.println("the methoad overriding");
	}
}
class child extends overriding
{
	public void get()
	{
		System.out.println("the paraent class implementation child class");
	}
}