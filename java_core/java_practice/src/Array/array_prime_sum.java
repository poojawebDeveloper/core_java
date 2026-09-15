package Array;

public class array_prime_sum {

	public static void main(String[] args) {

	int arr[] = {10, 3, 8, 13, 17, 20, 21, 29};
	
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
			}
	}

	}
}

