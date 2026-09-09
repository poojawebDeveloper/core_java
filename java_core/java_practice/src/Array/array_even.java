package Array;

public class array_even {

	public static void main(String[] args) {


		int arr []=new int [100];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
			
			if(i%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}*/
		
	}

}
