package program;

public class array_lowest_negative {

	public static void main(String[] args) {

	int arr [] = {-5, -4, -2, -6, -3, -2, -8, -77,-88};
	
	int lowest=-32768;
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>lowest)
		{
			lowest=arr[i];
		}
	}
    System.out.println("lowest:"+lowest);
	}

}
