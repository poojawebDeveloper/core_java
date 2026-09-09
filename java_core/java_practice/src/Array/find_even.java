package Array;

public class find_even {

	public static void main(String[] args) {

		int arr []= {85,77,46,45,79,53,55,54,26};
		
		System.out.println("list even number");

		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
