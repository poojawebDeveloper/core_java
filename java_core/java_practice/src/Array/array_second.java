package Array;

public class array_second {

	public static void main(String[] args) {
       
		int[] arr = {12, 7, 15, 18, 23, 30, 11, 40};
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
        System.out.println("first hieghts:"+lowest);
        System.out.println("second hieghts:"+slowest);

	}

}
