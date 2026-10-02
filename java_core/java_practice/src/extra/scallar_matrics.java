package extra;

public class scallar_matrics {

	public static void main(String[] args) {

     int arr[][]= {
    		 {5,0,0},
    		 {0,5,0},
    		 {0,0,5}
     };
     boolean same_valuecheck=true;
     boolean zero_check=true;
     
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=0;j<arr.length;j++)
    	 {
    		 if(i==j)
    		 {
    			 if(arr[i][j]!=arr[0][0])
    			 {
    				 same_valuecheck=false;
    				 break;
    			 }
    		 }
    		 else
    		 {
    			 if(arr[i][j]!=0)
    			 {
    				 zero_check=false;
    				 break;
    			 }
    		 }
    	 }
     }
     if(zero_check&&same_valuecheck)
     {
    	 System.out.println("scalar matrics");
     }
     else
     {
    	 System.out.println("normal");
     }
	}

}
