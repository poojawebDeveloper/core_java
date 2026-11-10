package function_base;

public class B3 {

	public static void main(String[] args) {

		int arr[]= {1,3,5,2,2};
		
		int sum=0;
		int left=0;


		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{

			int right=sum-left-arr[i];
			if(left==right)
			{
				System.out.println("equilibrim index:"+i);
				return;
			}
			left=left+arr[i];
           }

		System.out.println("no equilibrim index:");
		
	}

}

