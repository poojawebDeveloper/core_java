package Array;

public class second_largest_3 {

	public static void main(String[] args) {

	int arr[]= {73, 18, 45, 92, 7, 64, 31, 86, 53, 12, 99, 27, 58, 41, 76, 5, 83, 24, 67};
	int lowest=0;
	int slowest=0;
	int tlowest=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%3==0)
		{
			System.out.println("divisible by 3:"+arr[i]);
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

    System.out.println("1heights:"+lowest);
    System.out.println("2heights:"+slowest);
    System.out.println("3heights:"+tlowest);


	}

}
