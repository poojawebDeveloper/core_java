package mock;

public class primefunction {

	public static void main(String[] args) {


		prime p= new prime();
		
		p.prime(33);
		
		
	}

}
class prime
{
	int num=2;
	int count=0;
	
	public void prime(int n)
	{
		while(count<n)
		{
			boolean flag=false;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println("prime"+num);
				count++;
			}
			num++;
		}
	}
}