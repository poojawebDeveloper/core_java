package logic;

public class A2 {

	public static void main(String[] args) {


		int arr[]= {1,-1,2,-2,-3,3};
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==k)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}

}
