package logic;

public class Q8 {

	public static void main(String[] args) {


		int arr[]= {1,2,3,2,4,5,3,6};
		
		int max=0;
		int secondmax=0;
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
			if(count>max)
			{
				secondmax=max;
				max=count;
			}
			else if(count>secondmax&&count<max)
			{
				secondmax=count;
			}
			
			System.out.println(secondmax+":"+arr[i]);
					
		}
		
	}
}
