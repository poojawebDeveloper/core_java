package inheritance;

public class supermethod {

	public static void main(String[] args) {

		manager m = new manager();
		m.get();

		
	}

}

class bank
{
	 public void get()
	 {
		 System.out.println("bank details");
	 }
}
class manager extends bank
{
	public void get()
	{
		super.get();
		System.out.println("employee details");
	}
}