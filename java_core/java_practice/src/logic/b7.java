package logic;

public class b7 {

	public static void main(String[] args) {


		int[][] arr = {
			    {10, 20, 30},
			    {45, 15, 25},
			    {5, 60, 40}
			};


		
		for(int i=0;i<arr.length;i++)
		{
			int largest=arr[i][0];
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]>largest)
				{
					largest=arr[i][j];
				}
			}
		
		System.out.println("row"+(i+1)+":"+largest);
		}
	}

}
