package loop;

public class Forloop_prime1to50 {

	public static void main(String[] args) {

		for(int i=3;i<=50;i++)
		{
			boolean flag=false;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=true;
				}
			}
			if(!flag)
			{
				System.out.println("prime:"+i);
			}
						
		}
	}

}
