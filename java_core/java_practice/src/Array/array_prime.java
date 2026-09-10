package Array;

public class array_prime {

	public static void main(String[] args) {

		int[] arr = {12, 17, 5, 19, 22, 29, 31, 40, 43};
	
		for(int i=2;i<arr.length;i++)
		{
			
			boolean flag=false;
			for(int j=2;j<i;j++)
			{
				
			if(arr[i]%j==0)
			{
				flag=true;
				break;
			}
			}
			if(!flag)
			{
				System.out.println("prime:"+arr[i]);
			}
		}

	}

}
