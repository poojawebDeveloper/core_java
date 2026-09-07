package loop;
import java.util.Scanner;
public class user_num_prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enetr your number");
		int num=sc.nextInt();
		boolean flag= false;
		
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
			System.out.println("prime");
		}
		else
		{
			System.out.println("composite");
		}
	}

}
