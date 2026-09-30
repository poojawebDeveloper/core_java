package class_object;

public class static_method {

	public static void main(String[] args) {

		mobile.start();
		mobile.switchoff();

	}

}

class mobile
{
	public static void start()
	{
		System.out.println("start");
	}
	
	public static void switchoff()
	{
		System.out.println("switchoff");
	}
}