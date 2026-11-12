package all_code;

public class b2 {

	public static void main(String[] args) {
		
		System.out.println("method overloading");

		overloading o = new overloading();
		o.add(22, "abc", 24);//depend on you execute method it is called compile time

		}

}
class overloading
{
	public void add()
	{
		System.out.println("no parameter");
	}
	public void add(int x, int y,int z)
	{
		System.out.println("pass three parameter");
	}
	public void add(int x,String n,int z)
	{
		System.out.println("pass three parameter two intger and one string");
	}
	public void add(int x)
	{
		System.out.println("pass one parameter");
	}
	public void add(int x,int y)
	{
		System.out.println("pass two parameter");
	}
}