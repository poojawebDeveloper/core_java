package function_base;

public class A2 {

	public static void main(String[] args) {


		factorial f= new factorial();
		f.fact(5);
		
	}

}
class factorial
{
	
	public void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+"*");
			fact=fact*i;
		}
			System.out.print(fact);
		
	}
}
