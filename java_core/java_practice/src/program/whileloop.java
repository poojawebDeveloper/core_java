package program;

public class whileloop {

	public static void main(String[] args) {

		int num=1;
		int sum=0;
		
		while(num<=20)
		{
			if(num%2==0)
			{
				System.out.println(num);
				sum=sum+num;
			}
			num++;
		}
		System.out.println("sum"+sum);
	}

}
