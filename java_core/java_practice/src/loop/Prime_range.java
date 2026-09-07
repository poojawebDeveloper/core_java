package loop;

public class Prime_range {

	public static void main(String[] args) {

		for(int i=1;i<20;i++)
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
			else
			{
				System.out.println("composite");
			}
			
		}
	}

}
