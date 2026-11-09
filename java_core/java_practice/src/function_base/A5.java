package function_base;

public class A5 {

	public static void main(String[] args) {


		array a= new array();
		int arr[]= {40,55,58,89,98,67,63};
		a.largest(arr);
		
		
	}

}
class array
{
	public void largest(int arr[])
	{
		int largest=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println("largest elemnt:"+largest);
	}
}