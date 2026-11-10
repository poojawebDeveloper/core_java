package function_base;

public class A9 {

	public static void main(String[] args) {

		hii h = new hii();
		int arr[]= {1,2,3,2,4,1,5};
		h.check(arr);
		

		
	}

}
class hii
{
	public void check(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
}