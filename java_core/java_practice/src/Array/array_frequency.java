package Array;

public class array_frequency {

	public static void main(String[] args) {

    int arr[]= {1,1,2,2,2,3,3,4,4,4,4};
   
    for(int i=0;i<arr.length;i++)
    {
    	int counter=0;
    	int num;
    	num=arr[i];
    	for(int j=0;j<arr.length;j++)
    	{
    	  if(arr[j]==num) {	
    		counter++;
    	  }
    	}
    	System.out.println(arr[i]+":"+counter);
    }
    
	}

}
