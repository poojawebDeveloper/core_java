package Array_2D;

public class largest_2darray {

	public static void main(String[] args) {

    int arr[][]= {
    		{10,20,70},
    		{40,89,99},
    		{120,45,78}
    		
    };
   int  lowest=0;
   int row=0;
   int col=0;
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr[i].length;j++)
    	{
    		if(arr[i][j]>lowest)
    		{
    			lowest=arr[i][j];
    		}
    		 row=i;
    		 col=j;
    	}
    }
    System.out.println(lowest);
    System.out.println(row);
    System.out.println(col);
    
	}

}
