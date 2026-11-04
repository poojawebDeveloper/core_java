package polymorphism;

public class polymorphicobjctoverride {

	public static void main(String[] args) {


		fruit f= new mango();
		f.test();
	}

}
class fruit
{
	public void test()
	{
		this.name();
		System.out.println("all fruit sweet");
	}
	public void name()
	{
		System.out.println("this is fruit");
	}
}
class mango extends fruit
{
	public void test()
	{
		System.out.println("sweet");
	}
}