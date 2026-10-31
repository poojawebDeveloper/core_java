package inheritance;

public class c6 {

	public static void main(String[] args) {


		c c1= new c(4,5,3); //abc
		
	}

}
class a
{
	public a()
	{
		System.out.println("a");
	}
}
class b extends a
{
	public b(int x,int y)
	{
		 
		System.out.println("b");
	}
}
class c extends b
{
	public c (int x,int y,int z)
	{
		super(2,3);
		System.out.println("c");
	}
}