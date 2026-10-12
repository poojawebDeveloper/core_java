package extra;

public class else_if {

	public static void main(String[] args) {
		
		method m= new method();
		m.isprime(7);
	}

}
class method
{
	
	public int  isprime(int n)
	{
		boolean flag=false;
		for(int i=2;i<n;i++)
		{
			//boolean flag=false;
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("prime"+n);
		}
		else
		{
			System.out.println("composite:"+n);
		}
		return n;
	}
}