//write a java program to find the frequency of each element in array using user defined function
package logic;

public class Q2 {

	public static void main(String[] args) {


		b b1 = new b();
		int arr[]= {2,3,2,5,3,2,8};
		b1.array(arr);
		
		
	}

}
class b
{
	public void array(int arr[])
	{
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
			System.out.println(arr[i]+","+count);
		}
	}
}