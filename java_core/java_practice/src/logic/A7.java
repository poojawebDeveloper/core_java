package logic;

public class A7 {

	public static void main(String[] args) {


		int arr[]= {1,-1,3,2,-2,-3,3};
		int arr1[]=new int [arr.length];
		
		int target=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					arr1[i]=arr[i];
					arr1[j]=arr[j];
					//System.out.print(arr[i]+","+arr[j]);
					
				}
				
			}
		}
		for(int i=0;i<arr1.length;i++)
	{
			System.out.print(arr1[i]+",");
	}
	System.out.println();
	System.out.println(arr1.length);
	}

}
