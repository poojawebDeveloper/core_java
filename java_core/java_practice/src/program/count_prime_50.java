package program;

public class count_prime_50 {

	public static void main(String[] args) {

		int num=3;
		int counter=0;
		int sum=0;

		
		while(counter<50)
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
				sum=sum+num;
			}
			num++;
			
		}
		System.out.println("counter"  +counter);
		System.out.println("sum" +sum);
		 int sum1=5348;
		 boolean flag=false;
		for(int sum2 =2;sum2<5348;sum2++)
		{
			if(sum1%sum2==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("composite");
		}
	}

}
