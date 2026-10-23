package Scenario;

public class student {

	public static void main(String[] args) {


		int arr[]= {80,56,34,56,48,98,75,46,98,32};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>35)
			{
				System.out.println("pass"+arr[i]);
			}
			else
			{
				System.out.println("fail"+arr[i]);
			}
		}
	}

}
