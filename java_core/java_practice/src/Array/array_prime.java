package Array;

public class array_prime {

	public static void main(String[] args) {
		        
        int[] arr = {12, 7, 15, 18, 23, 30, 11, 40};
 
      for(int i=0;i<arr.length;i++)
    {
    	boolean flag=false;
    	for(int j=2;j<arr[i];j++)
    	{
    		if(arr[i]%j==0)
    		{
    			flag=true;
    			break;
    		}
    	}
    		if(!flag)
    		{
    			System.out.println("prime:"+arr[i]);
    		}

    	}
    }



}
