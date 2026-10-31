package inheritance;

public class third {

	public static void main(String[] args) {


		peacock p = new peacock();
		
		p.get();
		p.dis();
		
				
	}

}
class bird
{
	public void get()
	{
		System.out.println("bird");
	}
}
class peacock extends bird
{
	public void dis()
	{
		System.out.println("peacock");
	}
}