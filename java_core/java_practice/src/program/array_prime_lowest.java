package program;

public class array_prime_lowest {

	public static void main(String[] args) {

	int arr[]= new int[150];	
	int heights=0;	
    for(int i=50;i<arr.length;i++)
    {
    	boolean flag=false;
    	for(int j=2;j<i;j++)
    	{
      		if(i%j==0)
    		{
    			flag=true;
    			break;
    		}
    	}
       if(!flag)
    	{
    	   arr[i]=i;
    		System.out.println("prime:"+i);
    	}
    	if(arr[i]>heights)
    	{
    		heights=arr[i];
    	}
    }
    System.out.println("lowest of prime:"+heights);
	}

}
