package logic;

public class A8 {

	public static void main(String[] args) {


		int arr[]= {1,-1,5,-2,3,0};
		int arr1[]=new int[arr.length];
		int l=3;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==l)
					{
                         arr1[i]=arr[i];
                         arr1[j]=arr[j];
                         arr1[k]=arr[k];
					}
				}
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		System.out.println(arr1.length);
	}

}
