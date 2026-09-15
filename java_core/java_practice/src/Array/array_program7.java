package Array;

public class array_program7 {

	public static void main(String[] args) {

		int arr[] = {12, 5, 7, 18, 19, 25, 29, 30};
		int lowest=0;
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
				if(arr[i]>lowest)
				{
					lowest=arr[i];
				}
			}
			if(!flag)
			{
				System.out.println("prime:"+arr[i]);
			}
		}
            System.out.println("heights:"+lowest);
	}

}
