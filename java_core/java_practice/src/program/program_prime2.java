package program;

public class program_prime2 {

	public static void main(String[] args) {
         int counter=0;
		for(int i=601;i<=700;i++)
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
