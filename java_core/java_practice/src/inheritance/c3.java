package inheritance;

public class c3 {

	public static void main(String[] args) {

  
		hii h = new hii(1,2,3);
	}

}
class hii
{
	public hii()
	{
		this(2,4);
		System.out.println("a");
	}
	public hii(int x, int y,int z)
	{
		this(5);
		System.out.println("b");
	}
	public hii(int x)
	{
		this();
		System.out.println("c");
	}
	public hii(int x,int y)
	{
		System.out.println("d");
	}
}