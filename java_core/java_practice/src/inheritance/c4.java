package inheritance;

public class c4 {

	public static void main(String[] args) {


		bus b= new bus(2);
		
		//rtqps
	}

}
class bus
{
	public bus()
	{
		this(2,5,3,4);
		System.out.println("p");
	}
	public bus(int w,int x,int y,int z)
	{
		this(2,2,3);
		System.out.println("q");
	}
	public bus(int x,int y)
	{
		System.out.println("r");
	}
	public bus(int x)
	{
		this();
		System.out.println("s");
	}
	public bus(int x,int y,int z)
	{
		this(4,5);
		System.out.println("t");
	}
}