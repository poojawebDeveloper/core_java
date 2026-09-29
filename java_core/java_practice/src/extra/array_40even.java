package extra;

public class array_40even {

	public static void main(String[] args) {

    int arr[] = {10, 25, 30, 45, 50, 65, 80};

    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]>40)
    	{
    		if(arr[i]%2==0)
    		{
    	System.out.println(arr[i]);
    		}
    	}
    }
	}

}
