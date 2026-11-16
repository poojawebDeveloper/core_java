package polymorphism;

public class dmd1 {

	public static void main(String[] args) {


		a  a1 = new b();
		a1.show();
		
	}

}
class a
{
	int x=10;
	public void show()
	{
		System.out.println(x);
	}
}
class b extends a
{
	int y=20;
	public void show()
	{
		super.show();
		System.out.println(y);
	}
}