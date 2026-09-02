package practice;

public class Whileloop5 {
	public static void main(String args[])
	{
		int num=1;
		int counter=0;
		
		while(counter<98)
		{
			if(num%7==0)
			{
				System.out.println(num);
				counter++;
			
			}
			num++;
		}
		System.out.println(counter);
		
	}

}
