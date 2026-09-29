package class_object;

public class third {

	public static void main(String[] args) {

		Aeroplane aero=new Aeroplane();
		aero.takeoff();
		aero.landing();
	int litters=aero.fuel();
	
	System.out.println(litters);

	}

}
class Aeroplane
{
	public void takeoff() 
	{
		System.out.println("aeroplane is takeoff");
	}
	public void landing()
	{
		System.out.println("aeroplane is ground...");
	}
	public int fuel()
	{
		return 1230;
	}
}
