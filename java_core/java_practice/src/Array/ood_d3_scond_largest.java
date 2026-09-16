package Array;

public class ood_d3_scond_largest {

	public static void main(String[] args) {

	int arr[]= {87, 14, 63, 92, 35, 48, 71, 26, 99, 53, 42, 18, 75, 61, 30, 84, 9, 57, 44};
	int lowest=0;
	int slowest=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2!=0)
		{
			//System.out.println("ood:"+arr[i]);
			if(arr[i]%3==0)
			{
				System.out.println("ood div 3:"+arr[i]);
			}
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
		}
	

               System.out.println("1heights:"+lowest);
               System.out.println("2heights:"+slowest);

	}

}
