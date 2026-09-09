package loop;

import java.util.Scanner;

public class primer_program_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the counter");
		int c1=sc.nextInt();
		int num=3;
		int counter=0;
		
		while(counter<c1)
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
