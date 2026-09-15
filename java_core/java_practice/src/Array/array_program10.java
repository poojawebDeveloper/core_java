package Array;

public class array_program10 {

	public static void main(String[] args) {

	int	arr[] = {10, 3, 17, 8, 29, 12, 7, 21, 31, 14, 42};
	int heights=32768;
	for(int i=0;i<arr.length;i++)
	{
		boolean flag=false;
		for(int j=2;j<arr[i];j++)
		{
			if(arr[i]%j==0)
			{
				flag=true;
				break;
			}	
			if(arr[i]<heights)
			{
				heights=arr[i];
			}
				
		}
		if(!flag)
		{
			System.out.println("prime:"+arr[i]);
		}
	}
	
	System.out.println("lowest:"+heights);

	}

}
