package inheritance;

public class c8 {

	public static void main(String[] args) {

		three t=new three(2);//

	}

}
class one
{
	public one()
	{
		System.out.println("1");
	}
	public one(int x)     //1 2 4 3 5 7 6
	{
		this();
		System.out.println("2");
	}
}
class two extends one
{
	public two(int x,int y)
	{ 
		this();
		System.out.println("3");
	}
	public two()
	{
		super(4);
		System.out.println("4");
	}
	public two(int x)
	{
		this(2,3);
		System.out.println("5");
	}
}
class three extends two
{
	public three(int x)
	{
		this();
		System.out.println("6");
	}
	public three()
	{
		super(3);
		System.out.println("7");
	}
	
}