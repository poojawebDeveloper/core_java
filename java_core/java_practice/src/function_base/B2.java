package function_base;

public class B2 {

	public static void main(String[] args) {


		 mejority m1= new  mejority();
		 int arr[]= {2,2,1,2,3,2,2};
		 m1.check(arr);
		
	}

}
class mejority
{
	public void check(int arr[])
	{
		int result=0;
		int max=0;
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
				
				max=count;
				result=arr[i];
			}
		}
		System.out.println("maxium occurs element"+result);
		System.out.println("maximum frequency"+max);
	}
}