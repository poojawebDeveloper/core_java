package Array_2D;

public class found_element {

	public static void main(String[] args) {
       
      int arr[][]= {
    		  {5,0,0},
    		  {0,5,0},
    		  {0,0,5}
    		  
      };
      boolean zero_check=true;
      boolean same_digonal_value=true;;
      for(int i=0;i<arr.length;i++)
      {
    	  for(int j=0;j<arr[i].length;j++)
    	  {
    		 /* if(i!=j)
    		  {
    			  if(arr[i][j]==0)
    			  {
    				 zero_check=true;
    				 break;
    			  }*/
    		  
    		  if(i==j)
    		  {
    			  same_digonal_value=false;
    			  break;
    		  }
    		  else
    		  {
    			  if(arr[i][j]==0)
    			  {
    				  zero_check=false;
    				  break;
    			  }
    		  }
    	  }
    		  
    	  }
      if(zero_check&&same_digonal_value)
      {
    	  System.out.println("scaller matrix");
      }
      else
    	  
      {
    	  System.out.println("normal matrix");
      }
    	  
      }
      
	}


