package java_basic_program;

public class QR2 {

	public static void main(String[] args) {


		int arr[]= {10,25,5,40,30};
		
		int lowest=0;
		int slowest=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>lowest)
			{
				slowest=lowest;
				lowest=arr[i];
			}
			if(arr[i]!=lowest&&arr[i]>slowest)
			{
				slowest=arr[i];
			}
		}
		System.out.println("first larget:"+lowest);
		System.out.println("second larget:"+slowest);
	}

}
