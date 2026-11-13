package logic;

public class A1 {

	public static void main(String[] args) {


		int arr[]= {9,12,5,10,14,3,10};
		int pivet=10;
		
		//int arr1[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]>=pivet)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
				
	         }
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
