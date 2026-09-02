package practice;

public class Squareloop {

	public static void main(String[] args) {
		int num=1;
		int sum=0;
		while(num<=10)
		{
			System.out.println(num*num);
			sum=sum+(num*num);
			num++;
			
		}
		
		System.out.println("sum:"+sum);
	
	}

}
