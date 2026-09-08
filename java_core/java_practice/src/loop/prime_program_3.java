package loop;

public class prime_program_3 {

	public static void main(String[] args) {
        int counter=0;
		for(int i=201;i<300;i++)
		{
			boolean flag=false;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
				flag=true;
				}
			}
			if(! flag)
			{
				System.out.println("prime:"+i);
				counter++;
			}
		}
		System.out.println("counter:"+counter);
	}

}
