package program;

public class program_prime7 {

	public static void main(String[] args) {
       int num=3;
		int counter=0;
		while(counter<54)
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
				counter++;

				
			}
			
			num++;
		}
		System.out.println("counter:"+counter);
	}

}
