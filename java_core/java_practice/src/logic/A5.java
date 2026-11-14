package logic;

public class A5 {

	public static void main(String[] args) {


		int arr[]= {4,7,2,9,5,8};
		int sum=0;
		int average=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		average=sum/arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>average)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
