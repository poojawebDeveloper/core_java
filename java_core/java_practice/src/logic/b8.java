package logic;

public class b8 {

	public static void main(String[] args) {


		int[][] arr = {
			    {1, 2, 3},
			    {4, 8, 6},
			    {7, 2, 1}
			};
		int maxsum=0;
		int row=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr.length;j++)
			{
				sum=sum+arr[i][j];
			}
				if(sum>maxsum)
			{
				maxsum=sum;
				row=i;
			}
		}
				System.out.println("row"+(row+1)+":"+maxsum);
				
			
		}
	}


