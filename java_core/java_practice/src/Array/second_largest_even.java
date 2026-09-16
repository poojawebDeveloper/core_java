package Array;

public class second_largest_even {

	public static void main(String[] args) {
		
	int arr[]= {42, 17, 88, 31, 64, 9, 73, 26, 95, 14, 57, 81, 38, 6, 69, 23, 52};
	int lowest=0;
	int slowest=0;
	int tlowest=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			System.out.println("even num array:"+arr[i]);
		if(arr[i]>lowest)
		{
			slowest=lowest;
			lowest=arr[i];
		}
		if(arr[i]!=lowest&&arr[i]>slowest)
		{
			tlowest=slowest;
			slowest=arr[i];
		}
		if(arr[i]!=lowest&&arr[i]!=slowest&&arr[i]>tlowest)
		{
			tlowest=arr[i];
		}
		
		}
	}

	System.out.println("1 heights:"+lowest);
	System.out.println("2 heights:"+slowest);
	System.out.println("3 heights:"+tlowest);


	}

}
