package practice1;

public class third {

	public static void main(String[] args) {

		int arr[] = {1, 1, 2, 1, 3};
		//System.out.println(arr.length-1);


		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>arr.length/2)
			{
				System.out.println("Majority element:"+arr[i]);
				break;
			}
				
			
		}	
		
	}

}
