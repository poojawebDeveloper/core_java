package Array;

public class array_program5 {

	public static void main(String[] args) {

		int[] arr = {12, 5, 8, 17, 21, 23, 30, 7, 14, 19};

		int counter1=1;
		int counter2=1;
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("even:"+arr[i]);
				sum1=sum1+arr[i];
				counter1++;
			}
			else
			{
				System.out.println("odd:"+arr[i]);
				sum2=sum2+arr[i];
				counter2++;
			}
		}
		
		System.out.println("event count:"+counter1);
		System.out.println("sum of even:"+sum1);
		System.out.println("odd count:"+counter2);
		System.out.println("odd of sum:"+sum2);
		
		
	}

}
