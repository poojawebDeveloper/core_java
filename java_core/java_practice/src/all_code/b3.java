package all_code;

public class b3 {

	public static void main(String[] args) {

		System.out.println("satic method overload");
		
		overload o = new overload();
		o.get(22, 20);

	}

}
class overload
{
	public  static void get()
	{
		System.out.println("default");
	}
	public  static void get(int x,int y)
	{
		System.out.println("two");
	}
	public  static void get(int x)
	{
		System.out.println("three");
	}
}