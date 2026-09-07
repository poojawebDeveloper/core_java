package loop;
import java.util.Scanner;

public class user_prime_num {

	public static void main(String[] args) {

	int num=86;
		
		boolean flag=false;
		
		for(int i=2;i<85;i++)
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
