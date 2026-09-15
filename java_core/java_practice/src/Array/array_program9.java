package Array;

public class array_program9 {

	public static void main(String[] args) {
	
    int counter=0;
	int	arr[] = {12, 5, 8, 11, 15, 17, 20, 23, 25};
	
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
		}
		if(!flag)
		{
			System.out.println("prime:"+arr[i]);
			counter++;
		}
	}
	System.out.println("cont of prime:"+counter);
	
	}
}
