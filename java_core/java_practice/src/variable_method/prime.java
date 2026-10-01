package variable_method;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("eneter a satar ened");
		int n=sc.nextInt();
		int m=sc.nextInt();

	for(int i=n;i<m;i++)
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
		}
	}
	}

}
