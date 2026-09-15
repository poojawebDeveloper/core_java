package Array;

public class array_program8 {

	public static void main(String[] args) {
		
	int	arr[] = {10, 3, 7, 14, 17, 21, 23, 28, 31};
	int counter=0;
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		boolean flag=false;
		for(int j=2;j<arr[i];j++)
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
				sum=sum+arr[i];
				counter++;
			}
		}
	  System.out.println("cout of prime:"+counter);
	  System.out.println("sum of prime:"+sum);
	}


	}


