package constructor;

public class mock {

	public static void main(String[] args) {


		demo d= new demo();
		//d.add(40, 50);
		System.out.println(d.add(90, 50));
	}

}
class demo
{
	
	public int add(int x,int y)
	{
		if(x>y)
		{
			System.out.println("largest");
		}
		else
		{
			System.out.println("smallest");
		}
		return x+y;
	}
}
