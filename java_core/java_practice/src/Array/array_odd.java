package Array;

public class array_odd {

	public static void main(String[] args) {

		int arr[]= {89,78,49,39,42,63,78,80,89,23,24};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
				sum=sum+arr[i];
			}
		}
		System.out.println("odd of sum");
		System.out.println(sum);
	}

}
