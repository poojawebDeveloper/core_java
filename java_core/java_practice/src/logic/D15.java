package logic;

public class D15 {

	public static void main(String[] args) {


		int arr[]= {2,7,6,1,4,5};
		int k=3;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]%k==0)
				{
					System.out.print(arr[i]+","+arr[j]);
				}
			}
		}
	}

}