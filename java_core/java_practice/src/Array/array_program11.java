package Array;

public class array_program11 {

	public static void main(String[] args) {
		
	int	arr[] = {4, 7, 37, 11, 15, 17, 20, 23, 25, 29};
     
		for(int i=0;i<arr.length;i++)
		{    
			int even;
        	  if(i%2==0)
              {
            	  System.out.println("even index:"+arr[i]);
            	  arr[i]=even;
            	  }
        	  boolean flag=false;
        	  for(int j=2;j<arr[i];j++)
        	  {
        		  if(even%j==0)
        		  {
        			  flag=true;
        			  break;
        		  }
        	  }
        	  if(!flag)
        	  {
        		  System.out.println("prime:"+even);
        	  }
		}
	

	}
}

