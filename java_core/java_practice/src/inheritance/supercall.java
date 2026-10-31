package inheritance;

public class supercall {

	public static void main(String[] args) {

		mit m = new mit();
		m.dis();

	}

}
class collage
{

	public collage(int x)
	{
		System.out.println("=======");
	}
	public void get()
	{
		System.out.println("collage details");
	}
}
class mit extends collage
{
	public mit()
	{
		super(100);
		super.get();
		System.out.println("*************************");
	}
	public void dis()
	{
		
		System.out.println("collage mit");
	}
}