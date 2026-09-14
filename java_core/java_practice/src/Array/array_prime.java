package Array;

public class array_prime {

	public static void main(String[] args) {
		        
        int[] arr = {12, 7, 15, 18, 23, 30, 11, 40};
 
		//int[] arr = {11, 20, 7, 14, 9, 17, 30, 13};

    
    for(int i=0;i<arr.length;i++)
    {
    	boolean flag=false;
    	for(int j=2;j<i;j++)
    	{
    		if(arr[i]%j==0)
    		{
    			flag=true;
    			break;
    		}
    		if(!flag)
    		{
    			System.out.println("prime:"+arr[i]);
    		}

    	}
    }



}
}