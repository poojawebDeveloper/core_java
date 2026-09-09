package program;

public class program {

	public static void main(String[] args) {

		int num=10;
		
		if(num%2==0)
		{
			System.out.println("even:"+num);
		}
		else
		{
			System.out.println("odd:"+num);
		}
		
		System.out.println("square:"+num*num);
		System.out.println("cube:"+num*num*num);
		
		boolean flag=false;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("composite");
		}
	}

}
