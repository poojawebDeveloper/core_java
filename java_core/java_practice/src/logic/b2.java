package logic;

public class b2 {

	public static void main(String[] args) {


		int[] arr = {7, 1, 5, 3, 6, 4};
		
		int maxval=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int diff=arr[j]-arr[i];
				
				if(diff>maxval)
				{
					maxval=diff;
				}
			}
		}
		System.out.println("maximum difference:"+maxval);


	}

}

