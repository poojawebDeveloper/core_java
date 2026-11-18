package abstraction;

public class a5 {

	public static void main(String[] args) {

		vehicle v1= new bike(200);
		v1.start();
		v1.stop();
		
		vehicle v2= new car(400);
		v2.start();
		v2.stop();
		
		
		

		
	}

}
abstract class vehicle
{
	int milage;
	public vehicle(int m)
	{
		this.milage=m;
	}
	abstract public void start();
	public void stop()
	{
		System.out.println("stop vehicle....."+milage);
	}
}
class bike extends vehicle
{

	public bike(int m) {
		super(m);
	}

	@Override
	public void start() {
		System.out.println(" start bike"+milage);
		
	}
	
}
class car extends vehicle
{

	public car(int m) {
		super(m);
	}

	@Override
	public void start() {
System.out.println("start car"+milage);
		
	}
	
}