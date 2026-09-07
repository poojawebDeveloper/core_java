package loop;

public class prime_num_50_100 {

	public static void main(String[] args) {

		
		for(int i=51;i<100;i++)
		{
			boolean flag = false;
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
