package practice;

public class Digitsum {

	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		while(num==0)
		{
			sum=num%10;
			sum=sum+num;
		}
		System.out.println(sum);
	}

}
