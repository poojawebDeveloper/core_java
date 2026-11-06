package practice1;

public class weekend {

	public static void main(String[] args) {


		int arr[] = {4, 2, 7, 2, 8, 4, 9};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
		
			
		

	}

	
}
