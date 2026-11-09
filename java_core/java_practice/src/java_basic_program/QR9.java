//Question 28 – Find the Maximum Occurring Element
package java_basic_program;

public class QR9 {

	public static void main(String[] args) {


		int arr[] = {1, 2, 3, 2, 1, 2, 4};
		
		int result=0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				result=arr[i];
			}
		}
			System.out.println("maximum occurence element"+result);
			System.out.println("frequency"+max);
		
	}

}
