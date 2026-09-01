package practice;

public class While {

	public static void main(String[] args) {
		int num=1;
		int counter=0;
		while(num<500)
		{
			if(num%2==0&&num%3==0)
			{
				counter++;
				System.out.println(num);
			}
			num++;
		}
		System.out.println("count the value");
		System.out.println(counter);
	}

}
