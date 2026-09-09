package Array;

public class largest_even {

	public static void main(String[] args) {

		int arr []= {46,84,78,56,78,89,97,52,55};
		int lowest=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				
			}
		
			if(arr[i]>lowest)
			{
				lowest=arr[i];
			}
		}
		System.out.println(lowest);
	}

}
