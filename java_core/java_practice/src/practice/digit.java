package practice;

public class digit {

	public static void main(String[] args) {
		long num=15483675646l;
		int count=0;
		while(num!=0)
		{
	      num=num/10;
				count++;
		}
			System.out.println(count);
		}
	}


