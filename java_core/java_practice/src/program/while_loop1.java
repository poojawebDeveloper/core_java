package program;

public class while_loop1 {

	public static void main(String[] args) {

		int num=1;
		int counter=0;
		int sum=0;
		while(num<=100)
		{
			if(num%2==0)
			{
				System.out.println(num);
				sum=sum+num;
				counter++;
			}
			num++;
		}
		System.out.println("counter:"+counter);
		System.out.println("sum:"+sum);
	}

}
