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
    		  if(i!=j)
    		  {
    			  if(arr[i][j]==0)
    			  {
    				 zero_check=true;
    				 break;
    			  }
    		  
    		/*  if(i==j)
    		  {
    			  if(arr[i][j]!=1)
    			  {
    			  same_digonal_value=false;
    			  }
    			  break;
    		  }*/
    		  else
    		  {
    			  if(arr[i][j]!=1)
    			  {
    				  same_digonal_value=true;
    				  break;
    			  }
    		  }
    	  }
    		  
    	  }
      }
     
      if(zero_check&&same_digonal_value)
      {
    	  System.out.println("scaler matrix");
      }
      else
    	  
      {
    	  System.out.println("normal matrix");
      }
    	  
      }
      
	}



