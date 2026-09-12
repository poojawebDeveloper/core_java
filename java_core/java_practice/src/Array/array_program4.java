package Array;

public class array_program4 {

	public static void main(String[] args) {

		int[] arr = {12, 7, 15, 18, 23, 30, 11, 40,50,99,87,55};
        int counter1=0;
        int counter2=0;
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]%2==0)
		{
			System.out.println("even"+arr[i]);
			counter1++;
		}
		else 
		{
			System.out.println("odd:"+arr[i]);
			counter2++;
		}
		
		}
		System.out.println("count of even:"+counter1);
		System.out.println("count of odd:"+counter2);

	}

}
