package variable_method;

public class method_prange {

	public static void main(String[] args) {

	       Range.isprimerange(1, 100);

	}

}
class Range
{
	public static void isprimerange(int start ,int end)
	{
		
		for(int i=start;i<end;i++)
		{
			boolean flag=false;

			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println("prime:"+i);
			}
		}
	}
}