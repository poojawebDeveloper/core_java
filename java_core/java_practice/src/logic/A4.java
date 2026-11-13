package logic;

public class A4 {

	public static void main(String[] args) {


		int arr[]= {7,2,9,1,5,8};
		
		 int x=4;
		 int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>x)
			{
				System.out.print(arr[i]+",");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}

}
