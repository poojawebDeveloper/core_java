package Array;

public class array_program12 {

	public static void main(String[] args) {

	int arr[] = {14, 7, 22, 11, 35, 19, 8, 23, 4, 17, 29};
	int sum=0;
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
			sum=sum+arr[i];
		}
		
	}
	
	 System.out.println("sum of prime:"+sum);
	 System.out.println("lowest of prime:"+heights);
	 if(heights%2==0)
		{
			System.out.println("even heigts");
		}
		else
		{
			System.out.println("odd heights");
		}
	}

}
