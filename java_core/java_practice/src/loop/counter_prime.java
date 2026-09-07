package loop;

public class counter_prime {

	public static void main(String[] args) {

		int num=1;
		int counter=0;
		while(counter<70)
		{
			boolean flag =false;
			for(int i=2;i<num;i++ )
			{
					if(num%i==0)
					{
						flag=true;
						break;
					}
				
			}
			
			if(!flag)
			{
				System.out.println("prime:"+num);
				counter++;
			}
			
			num++;
			
		}
		System.out.println("counter:"+counter);
		
		}
	}


