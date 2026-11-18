package polymorphism;

public class covariant {

	public static void main(String[] args) {

         
		drive1 d = new drive1();
         
         
	}

}
class car
{
  public void run()
  {
	  System.out.println("class run");
  }
}
class farari extends car
{
	public void get()
	{
		System.out.println("farari run");
	}
}
class drive
{
	public car dis()
	{
		return new car();
	}
}
class drive1 extends drive
{
	public farari show()
	{
		return new farari();
	}
}