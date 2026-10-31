package inheritance;

public class c5 {

	public static void main(String[] args) {


		Oops o  = new Oops();
		
	}

}
class java
{
	int val;
	public java(int x)
	{
		System.out.println("is parant:"+x);
		this.val=x;
	}
	public void get()
	{
		System.out.println(val*2);
	}
}
class Oops extends java
{
	public Oops()
	{
		super(100);
		super.get();
		System.out.println("is child");
	}
}