package Array;

public class array_h1 {

	public static void main(String[] args) {

	int arr[]=	{4, 7, 11, 15, 18, 23, 29, 30};
	int lowest=0;
	int slowest=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>lowest)
		{
			slowest=lowest;
			lowest=arr[i];
		}
		if(arr[i]>slowest&&arr[i]!=lowest)
		{
			slowest=arr[i];
		}

		
	}
	System.out.println(lowest);
	System.out.println(slowest);

	}

}
