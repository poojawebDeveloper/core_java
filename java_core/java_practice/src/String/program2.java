package String;

public class program2 {

	public static void main(String[] args) {


		int arr[] = {1, 2, 3, 4, 5, 6};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]%2!=0)
				{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
				}
			}}
		}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
