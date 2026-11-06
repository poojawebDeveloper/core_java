package polymorphism;

public class dmd_constructor {

	public static void main(String[] args) {


		dmdconstructor d= new child();
		d.dis();
		
	}

}
class dmdconstructor
{
 
	public dmdconstructor()
	{
		dis();
	}
	public void dis()
	{
		System.out.println("dispaly parent");
	}
}
class child extends dmdconstructor
{
	int x=100;
	
	public child()
	{
		System.out.println("child constructor");
	}
	public void dis()
	{
		System.out.println("child display"+x);
	}
}