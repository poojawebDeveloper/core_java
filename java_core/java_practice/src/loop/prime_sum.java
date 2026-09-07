package loop;

public class prime_sum {

	public static void main(String[] args) {

		int sum=0;
		
		for(int i=1;i<30;i++)
		{
			boolean flag=false;
			for(int j=2;j<i;j++)
			{
				if (i%j==0)
				{
					flag=true;
				}
			}
			if(!flag)
			{
				System.out.println("prime:" +i);
				sum=sum+i;
			}
			
		}
		System.out.println("sum:"+sum);
	}

}
