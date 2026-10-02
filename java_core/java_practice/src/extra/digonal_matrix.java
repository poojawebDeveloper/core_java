package extra;

public class digonal_matrix {

	public static void main(String[] args) {

       int arr[][]= {
    		   {0,4,7},
    		   {1,0,5},
    		   {6,5,0}
    		   
       };
       boolean zero_check=true;
       boolean non_zerocheck=true;
       
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=0;j<arr.length;j++)
    	   {
    		   if(i==j)
    		   {
    			   if(arr[i][j]!=0)
    			   {
    				   zero_check=false;
    				   break;
    			   }
    		   }
    		   else
    		   {
    			   if(arr[i][j]==0)
    			   {
    				   non_zerocheck=false;
    				   break;
    			   }
    		   }
    	   }
       }
       if(zero_check&&non_zerocheck)
       {
    	   System.out.println("digonal matrics");
       }
       else
       {
    	   System.out.println("normal matrics");
       }
	}

}
