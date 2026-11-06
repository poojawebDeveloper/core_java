package polymorphism;

public class dmd {

	public static void main(String[] args) {


		fruit12 f = new mango12();
		f.test();
		
	}

}
class fruit12
{
	public void test()
	{
		System.out.println("sweet");
	}
}
class mango12 extends fruit12
{
	public void test()
	{
		System.out.println("sweet mango");
	}
}