package java_basic_program;

public class Q7 {

	public static void main(String[] args) {

		
		a a1= new a();
		a1.function(0);
	}

}
class a
{
	public void function(int x)
	{
		if(0>x)
		{
			System.out.println("negative num"+x);
		}
		else if(0<x)
		{
			System.out.println("positive num"+x);
		}
		else
		{
			System.out.println("zero");
		}
	}
}