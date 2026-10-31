package inheritance;

public class first {

	public static void main(String[] args) {

		Son s = new Son();
		s.farming();
		System.out.println(s.jameen);
		
	}

}
class Father
{
	int jameen=100;
	
	public void farming()
	{
		System.out.println("farming");
	}
	
}
class Son extends Father
{
	
}