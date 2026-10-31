package inheritance;

public class fruit extends banana {

	public static void main(String[] args) {


		fruit f = new fruit();
		f.get();
		f.dis();
		
	}

}
class Mango
{
   
	public void get()
	{
		System.out.println("mango is sweet");
	}
}
class Banana extends Mango
{
	public void dis()
	{
		System.out.println("banana is sweet");
	}
}
