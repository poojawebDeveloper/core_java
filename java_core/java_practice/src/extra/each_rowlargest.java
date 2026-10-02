package extra;

public class each_rowlargest {

	public static void main(String[] args) {

		int[][] arr = {
			    {10, 20, 30},
			    {99, 50, 60},
			    {70, 100, 90}
			};
		
		
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr.length;j++)
			{
				sum=sum+arr[i][j];
			}
			System.out.println(sum/arr[i].length);
		}
		//System.out.println(sum);
	}

}
