package inheritance;

public class second {

	public static void main(String[] args) {

		Son s = new Son();
		s.farming();
		System.out.println(s.jameen);
		

		
	}

}
class Ft
{
	int jameen=100;
	
	public void farming()
	{
		System.out.println("farming");
	}
}
class Son1 extends Ft
{
	String car="city";
	
}