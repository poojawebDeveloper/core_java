package abstraction;

public class a2 {

	public static void main(String[] args) {

		b b1 = new b();
		b1.dis();

		
	}

}
 abstract class a
{
	public a()
	{
		System.out.println("abstarct constructor");
	}
	abstract public void dis();
}
 class b extends a
 {

	@Override
	public void dis() {
		System.out.println("abstarct method is complete");
	}
	 
 }