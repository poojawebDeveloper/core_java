package polymorphism;

public class smethodoverridestaticno {

	public static void main(String[] args) {


		demo2.dis();
		
	}

}
class demo
{
	public static void dis()
	{
		System.out.println("demo detatils");
	}
}
class demo2 extends demo
{
	public static void dis()
	{
		System.out.println("demo display");//static method cannot be override but hide data
	}
}
