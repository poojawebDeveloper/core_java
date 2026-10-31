package inheritance;

public class supervariable {

	public static void main(String[] args) {

		pune p = new pune();
		p.get();

		
	}

}
class city
{
String name="city";
	
}
class pune extends city
{
	String name="pune";
	
	void get()
	{
	System.out.println(super.name);
		System.out.println("name of city");
	}
}