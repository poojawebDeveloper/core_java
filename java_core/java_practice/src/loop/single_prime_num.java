package loop;

public class single_prime_num {

	public static void main(String[] args) {

		int num=45;
		
		boolean flag=false;
		for(int i=2;i<45;i++)
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
			System.out.println(num+":composite");
		}
	}

}
