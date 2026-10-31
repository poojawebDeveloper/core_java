package inheritance;

public class c2 {

	public static void main(String[] args) {

		Car c = new Car();
		
		//cbda

	}

}
class Car
{
	public Car()
	{
		this(4,5,3);
		System.out.println("a");
	}
	public Car(int x)
	{
		this(4,5);
		System.out.println("b");
	}
	public Car(int x ,int y)
	{
		
		System.out.println("c");
	}
	public Car(int x,int y,int z)
	{
		this(2);
		System.out.println("d");
	}
}