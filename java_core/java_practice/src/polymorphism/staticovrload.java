package polymorphism;

public class staticovrload {

	public static void main(String[] args) {

		A.get(2, 4);

	}

}
class A
{
	public static void get()
	{
		System.out.println("ststic deafault");
	}
	public static void get(int x)
	{
		System.out.println("ststic one parameter");
	}public static void get(int x,int y)
	{
		System.out.println("ststic two parameter");
	}
}