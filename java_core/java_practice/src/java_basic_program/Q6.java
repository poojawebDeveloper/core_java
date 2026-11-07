package java_basic_program;

public class Q6 {

	public static void main(String[] args) {


		int num=7;
		
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
			System.out.println("prime:"+num);
		}
		else
		{
			System.out.println("composite:"+num);
		}
	}

}
