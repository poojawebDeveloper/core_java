package extra;

public class this_method {

	public static void main(String[] args) {

		animal ani = new animal();
		ani.run();

	}

}
class animal
{
	public void run()
	{
		this.alert();
		System.out.println("animal is run");
	}
	public void sleep()
	{
		System.out.println("animal is sleep");
	}
	public void alert()
	{
		this.sleep();
		System.out.println("animal is alert");
	}
}