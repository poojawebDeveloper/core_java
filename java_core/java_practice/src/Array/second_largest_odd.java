package Array;

public class second_largest_odd {

	public static void main(String[] args) {

	int arr[]= {64, 17, 92, 8, 45, 71, 23, 56, 99, 31, 14, 83, 38, 5, 76};
	int heights=32768;
	int slowest=32768;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2!=0)
		{
			System.out.println("ood number array:"+arr[i]);
		
	
		if(arr[i]<heights)
		{
			slowest=heights;
			heights=arr[i];
		}
		if(arr[i]!=heights&&arr[i]<slowest)
		{
			slowest=arr[i];
		}
		}
	}

    System.out.println("1lowest array odd:"+heights);
    System.out.println("2lowest array odd:"+slowest);

	}

}
