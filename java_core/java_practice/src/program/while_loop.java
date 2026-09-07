package program;

public class while_loop {
	public static void main(String args[])
	{
		int num=1;
		int sum=0;
		int counter=1;
		
		while(num<=50)
		{
			System.out.println(num);
			counter++;
			sum=sum+num;
			num++;
		}
		System.out.println(sum);
		System.out.println(counter);
	}

}
