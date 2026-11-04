package polymorphism;

public class methodoverrid {
	
	public static void main (String args[])
	{
		
		boat b= new boat();
		b.drive();
	}

}
class bus
{
	public void drive()
	{
		System.out.println("road");
	}
}
class boat extends bus
{
	public void drive()     // override method
	{
		System.out.println("water");
	}
}