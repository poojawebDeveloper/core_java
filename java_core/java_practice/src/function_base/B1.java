package function_base;

public class B1 {

	public static void main(String[] args) {


		mn m = new mn();
		int arr[]= {1,2,3,5,6};
		m.check(arr);
		
	}

}
class mn
{
	public void check(int arr[])
	{
		for(int n=1;n<6;n++)
		{
			boolean missing = false;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==n)
				{
					missing=true;
					break;
				}
			}
			if(!missing)
			{
				System.out.println(n);
			}
		}
	}
}