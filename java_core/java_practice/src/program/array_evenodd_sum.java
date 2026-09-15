package program;

public class array_evenodd_sum {

	public static void main(String[] args) {

		int arr[] = {12, 5, 8, 7, 10, 3, 11, 17};
		int sum1=0;
		int sum2=0;
		int counte=0;
		int counto=0;
		int countp=0;
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
				countp++;
			}
			
			if(arr[i]%2==0)
			{
				System.out.println("even:"+arr[i]);
				sum1=sum1+arr[i];
				counte++;
			}
			else
			{
				System.out.println("odd:"+arr[i]);
				sum2=sum2+arr[i];
				counto++;
			}
		}
		System.out.println("count even:"+counte);
		System.out.println("sum even:"+sum1);
		System.out.println("count odd:"+counto);
		System.out.println("sum odd :"+sum2);
		System.out.println("count prime:"+countp);

	}

}
