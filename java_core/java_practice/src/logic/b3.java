package logic;

public class b3 {

	public static void main(String[] args) {


		int[] arr = {2, 7, 5, 9, 3, 11};
		int target = 2;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(Math.abs(arr[i]-arr[j])==target)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}

}
