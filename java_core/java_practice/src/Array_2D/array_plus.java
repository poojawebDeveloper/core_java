package Array_2D;

public class array_plus {

	public static void main(String[] args) {

     int arr[]= {1,7,4,5,6,2,8};
     
     int target=8;
     
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=i+1;j<arr.length;j++)
    	 {
    		 if(arr[i]+arr[j]==target)
    		 {
    			 System.out.println(arr[i]);
    			 System.out.println(arr[j]);
    		 }
    	 }
     }
     
	}

}
