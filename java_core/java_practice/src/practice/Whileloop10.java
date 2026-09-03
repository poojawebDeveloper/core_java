package practice;

public class Whileloop10 {

	public static void main(String[] args) {
		int num=1;
		int counter=0;
		while(num<=100)
		{
			if(num%3==0)
			{
			System.out.println(num);
			counter++;
			}
			num++;
		}
		System.out.println(counter);
	}

}
