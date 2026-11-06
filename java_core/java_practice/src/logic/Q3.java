package logic;

public class Q3 {

	public static void main(String[] args) {


		c c1 = new c();
		int arr[]= {0,5,0,3,8,0,2};
		c1.move(arr);
	}

}
class c
{
	public void move(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			
		{
			System.out.print(arr[i]+" ");
		}
	}
}