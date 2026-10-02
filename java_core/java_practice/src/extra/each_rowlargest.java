package extra;

public class each_rowlargest {

	public static void main(String[] args) {

		int[][] arr = {
			    {10, 20, 30},
			    {99, 50, 60},
			    {70, 100, 90}
			};
		int lowest=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				
				if(arr[i][j]>lowest)
				{
					lowest=arr[i][j];
				}
			}
			System.out.println(lowest);

		}
		//System.out.println(lowest);
	}

}
