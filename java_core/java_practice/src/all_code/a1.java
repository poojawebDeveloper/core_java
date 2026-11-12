package all_code;

public class a1 {

	public static void main(String[] args) {


		returning r = new returning();
		System.out.println(r.add(4, 5));
		System.out.println(r.mul(4, 5));
		
	}

}
class returning 
{
	public int add(int x,int y)
	{
		System.out.println("returning method");
		return x+y;
	}
	public int mul(int x,int y)
	{
		return x*y;
	}
}