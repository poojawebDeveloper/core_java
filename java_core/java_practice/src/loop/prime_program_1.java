package loop;

public class prime_program_1 {

	public static void main(String[] args) {

		int num=79;
		boolean flag = false;
		for(int i=1;i<79;i++)
		{
			if(num%i==0)
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
