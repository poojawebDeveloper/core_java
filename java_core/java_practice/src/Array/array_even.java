package Array;

public class array_even {

	public static void main(String[] args) {


		int arr []=new int [100];
		
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=i;
			
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
