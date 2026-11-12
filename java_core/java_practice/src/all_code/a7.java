package all_code;

public class a7 {

	public static void main(String[] args) {


		dog d = new dog();
		d.dis();
		d.get();
	}

}
class animal
{
	public void dis()
	{
		System.out.println("singlelevel inheritance");
		System.out.println("this is animal");
	}
	
}
class dog extends animal
{
	public void get()
	{
		System.out.println("this is dog");
	}
}