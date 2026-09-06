package program;

public class dowhile_ {

	public static void main(String[] args) {

		int num=1;
		int counter=0;
		int sum=0;
		do
		{
			if(num%3==0 && num%5==0)
			{
				System.out.println(num);
				sum=sum+num;
				counter++;
			}
			
			num++;
		}while(counter<80);
		System.out.println("counter:"+counter);
		System.out.println("sum:"+sum);
	}

}
