package Array_2D;

public class lowest_2Darray {

	public static void main(String[] args) {
		
		int arr [][]=new int [3][3];
	      int lowest=0;
	      int slowest=0;
	     arr[0][0]=50;
	     arr[0][1]=96;
	     arr[0][2]=23;
	     arr[1][0]=59;
	     arr[1][1]=56;
	     arr[1][2]=78;
	     arr[2][0]=99;
	     arr[2][1]=75;
	     arr[2][2]=30;
	     
	     for(int i=0;i<arr.length;i++)
	     {
	    	 for(int j=0;j<arr[i].length;j++)
	    	 {
	    		 System.out.print(arr[i][j]+" ");
	    		 
	    		 if(arr[i][j]>lowest)
	    		 { 
	    			 slowest=lowest;
	    			 lowest=arr[i][j];
	    		 }
	    		 if(arr[i][j]!=lowest&&arr[i][j]>slowest)
	    		 {
	    			 slowest=arr[i][j];
	    		 }
	    	 }
	    	 System.out.println();
	     }
	     System.out.println("hieghts:"+lowest);
	     System.out.println("2hiesghts:"+slowest);
	     
	}

}
