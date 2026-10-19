package extra;

public class missing {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 5, 6,8,9};
		
		for(int n=1;n<=9;n++)
		{
			boolean found=false;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==n)
				{
					found=true;
					break;
				}
			}
			if(!found)
			{
				System.out.println(n);
			}
		}

	}

}
