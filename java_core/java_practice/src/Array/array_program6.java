package Array;

public class array_program6 {

	public static void main(String[] args) {

		int[] arr = {5, 10, 15, 20, 21, 30, 35, 40, 24, 9};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0)
			{
				System.out.println("divisible by 3:"+arr[i]);
			}
		}

	}

}
