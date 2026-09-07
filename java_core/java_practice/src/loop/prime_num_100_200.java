package loop;

public class prime_num_100_200 {

	public static void main(String[] args) {

		int counter=1;
		
		for(int i=101;i<=200;i++)
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
				System.out.println("prime:" +i);
				counter++;
			}
		}
		System.out.println("count:"+counter);

	}

}
