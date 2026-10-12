package extra;

public class weekend {

	public static void main(String[] args) {
		
		int num=89;
		
	boolean flag=true;
	for(int i=2;i<num/2;i++)
	{
		if(num%i==0)
		{
			flag=false;
			break;
		}
	}
	if(flag)
	{
		System.out.println("prime:"+num);
	}
	else
	{
		System.out.println("composite"+num);
	}
	}

}
