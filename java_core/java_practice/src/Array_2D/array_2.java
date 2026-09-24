package Array_2D;

public class array_2 {

	public static void main(String[] args) {

		int arr[] = {10, 20, 30, 40, 50};
	
		for(int i=0;i<arr.length;i++)
		{
			int temp;
			temp=arr[0];
			if(arr[i]>temp)
			{
				
				System.out.print(arr[i]+" ");
				
				
			}
		
			
		}
		System.out.println(arr[0]);
	}

}
