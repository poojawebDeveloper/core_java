package polymorphism;

public class dmdneed {

	public static void main(String[] args) {


		school sc= new potadar();
		sc.admission();
	}

}
class school
{
	public void admission()
	{
		System.out.println("admision");
	}
}
class potadar extends school
{

	public void admission()
	{
		System.out.println(" potadar admision");
	}
}