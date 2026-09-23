package Array_2D;

public class two_num {

	public static void main(String[] args) {

     int arr[]= {1,8,7,2,6,3,5,8};
    int target=8;
    
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr.length;j++)
    	{
    		if(arr[i]+arr[j]==target)
    		{
    			System.out.print(arr[i]+",");
    			System.out.print(arr[j]+" ");

    		}
    		
    	}
    }
        

	}

}
