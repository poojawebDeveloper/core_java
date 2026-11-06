
package logic;

public class Q4 {

	public static void main(String[] args) {


		arr a= new arr();
		
		int arrr[]= {10,25,5,40,30};
		a.largest(arrr);
	}

}
class arr
{
	int largest=0;
	int slargest=0;
		
	public void largest(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				slargest=largest;
				largest=arr[i];
			}
			if(arr[i]!=largest&&arr[i]>slargest)
			{
				slargest=arr[i];
			}
			
		}
		System.out.println(largest);
		System.out.println(slargest);
	}
	
}