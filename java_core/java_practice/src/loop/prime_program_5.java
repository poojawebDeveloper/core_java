package loop;

public class prime_program_5 {

	public static void main(String[] args) {
         
		int counter=0;
		for(int i=301;i<=400;i++)
		{
			boolean flag=false;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println("prime:"+i);
				counter++;
			}
		}
		System.out.println("counter:"+counter);
	}

}
