package logic;

public class Q7 {

	public static void main(String[] args) {


		int arr[]= {1,2,8,1,1,3,4};
		int target=5;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					for(int l=k+1;l<arr.length;l++)
					{
						if(arr[i]+arr[j]+arr[k]+arr[l]==target)
						{
							System.out.println("{"+arr[i]+","+arr[j]+","+arr[k]+","+arr[l]+"}");
						}
					}
				}
			}
		}
	}

}
