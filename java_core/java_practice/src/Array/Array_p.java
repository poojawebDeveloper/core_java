package Array;

public class Array_p {

	public static void main(String[] args) {

    int arr[]=new int[100];
    int lowest=0;
    for(int i=1;i<arr.length;i++)
    {
    	boolean flag= true;
    	for(int j=2;j<i;j++)
    	{
    		if(i%j==0)
    		{
    			flag=false;
    			break;
    		}
    	}
    	if(!flag)
    	{
         arr[i]=i;
       System.out.println("prime:"+i);
    	}
    	
       
       if(arr[i]>lowest)
     	{   
    	  lowest=arr[i]; 
    	}
    }
    System.out.println("prime number heights:"+lowest);
	}

}
