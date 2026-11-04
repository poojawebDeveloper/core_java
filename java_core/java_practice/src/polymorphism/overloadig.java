package polymorphism;

public class overloadig {

	public static void main(String[] args) {


		addd a = new addd();
		a.add(2, 4);
		
	}

}
class addd
{
	public void add(int x,int y)//instance method
	{
		System.out.println("x+y");
	}
	public void add(int d,long c)
	{
		System.out.println("d+c");
	}
	public void add(int x,int y,int z)
	{
		System.out.println("x+y+z");
	}
}