package extra;

public class prime_ditinct {

	public static void main(String[] args) {


		int count=0;
		for(int i=01;i<=100;i++)
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
				count++;
				if(count%2==0)
				{
					System.out.println("prime"+i);	
				}
				
			}
		}
	}

}
