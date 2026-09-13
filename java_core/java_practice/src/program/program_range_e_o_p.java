package program;

public class program_range_e_o_p {
	
	public static void main(String args[]) {
		
		int num=40;
		int counter1=1;
		int counter2=1;
		int counter3=1;
		while(num<=90)
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
				System.out.println("prime:"+num);
				counter3++;
			}
			
			if(num%2==0)
			{
				System.out.println("even"+num);
				counter1++;
			}
			else
			{
				System.out.println("odd"+num);
				counter2++;
			}
			num++;
		}
		System.out.println("count even:"+counter1);
		System.out.println("count odd:"+counter2);
		System.out.println("count prime:"+counter3);
	}

}
