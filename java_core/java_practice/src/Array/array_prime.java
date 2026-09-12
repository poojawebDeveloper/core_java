package Array;

public class array_prime {

	public static void main(String[] args) {

		int[] arr = {17, 19, 5, 32, 23, 5,  22, 29, 31, 40, 43};
		boolean flag=false;
		

		for( int i=0;i<arr.length;i++)
	     {
			for(int j=2;j<i;j++)
			{
				
			if(arr[i]%j==0)
			{
				flag=true;
				
			}
			}
		
			if(!flag)
			{
				System.out.println("prime:"+arr[i]);
			}
		}
		System.out.println(arr.length);
				
		}

	}


