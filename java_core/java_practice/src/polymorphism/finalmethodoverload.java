package polymorphism;

public class finalmethodoverload {

	public static void main(String[] args) {

		d d1= new d();
		d1.dis("abc");

	}

}
class d
{
	final public void dis()
	{
		System.out.println("a");
	}
	final public void dis(int x)
	{
		System.out.println("b");
	}
	final public void dis(String s)
	{
		System.out.println("c");
	}
	final public void dis(int l ,int x)
	{
		System.out.println("a");
	}
}