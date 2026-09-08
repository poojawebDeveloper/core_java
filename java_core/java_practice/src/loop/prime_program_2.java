package loop;

public class prime_program_2 {

	public static void main(String[] args) {

		int num=97;
		boolean flag=false;
		for(int i=2;i<97;i++)
		{
			if(num%i==0)
			{
				flag=true;
			}
		}
		if(!flag)
		{
			System.out.println("this is prime number");
		}
		else
		{
			System.out.println("this is composite number");
		}
	}

}
