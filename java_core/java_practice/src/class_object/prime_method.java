package class_object;

public class prime_method {

	public static void main(String[] args) {

		prime.isprime(89);

	}

}

class prime
{
	public static void isprime(int n)
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
			System.out.println("is prime:"+n);
		}
		else
		{
		System.out.println("is composite:"+n);
		}
	}
}
