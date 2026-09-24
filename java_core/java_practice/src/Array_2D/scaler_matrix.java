package Array_2D;

public class scaler_matrix {

	public static void main(String[] args) {

      int arr[][]= {
    		  {1,0,0},
    		  {0,1,0},
    		  {0,0,1}
    		    
      };
      
      boolean same_digonal_value=true;
      
      for(int i=0;i<arr.length;i++)
      {
    	  for(int j=0;j<arr[i].length;j++)
    	  {
    		  if(i==j)
    		  {
    			  if(arr[i][j]!=arr[0][0])
    			  {
    				  same_digonal_value=false;
    				  break;
    			  }
    		  }
    		  else
    		  {
    			  if(arr[i][j]!=0)
    			  {
    				  same_digonal_value=false;
    				  break;
    			  }
    		  }
    	  }
      }
    	  
    	  if(same_digonal_value&&arr[0][0]!=1)
    	  {
    		  System.out.println("scaler");
    	  }
    	  else
    	  {
    		  System.out.println("normal");
    	  }
      
	

}
}