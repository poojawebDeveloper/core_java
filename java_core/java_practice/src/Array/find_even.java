package Array;

public class find_even {

	public static void main(String[] args) {

		int arr []= {85,77,46,45,79,53,55,54,26};
		
		System.out.println("list even number");

		for(int i=0;i<arr.length;i++)
		{
			
			if(i%2==0)
			{
				System.out.println(arr[i]);
			}
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
				System.out.println("even prime:"+arr[i]);
				if(i%2!=0)
				{
					System.out.println("normal index:"+arr[i]);
				}
			}


		}
	}

}
