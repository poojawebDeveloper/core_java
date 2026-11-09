package function_base;

public class A1 {

	public static void main(String[] args) {

        prime p = new prime();
		p.check(12);
		p.check(17);

	}

}
class prime
{
	
	public void check(int n)
	{
		boolean flag=false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("prime:"+n);
		}
		else
		{
			System.out.println("composite:"+n);
		}
	}
}