package constructor;

public class parameterized_non {

	public static void main(String[] args) {

		addition add = new addition();
		addition first = new addition(10,20);
		

	}

}
class addition
{
	public addition()
	{
		System.out.println("the number is addition");
	}
	public addition(int x,int y)
	{
		System.out.println(x+y);
	}
}