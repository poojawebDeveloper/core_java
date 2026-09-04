package loop;

public class prime_number {

	public static void main(String[] args) {
      
		int num=51;
		boolean flag=false;
		for(int i=2;i<=50;i++)
		{
			if(num%i==0)
			{
			  flag=true;
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
