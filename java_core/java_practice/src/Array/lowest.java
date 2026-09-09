package Array;

public class lowest {

	public static void main(String[] args) {

     int arr[]= {10,50,46,89,966,78};
     
     int lowest=0;
     
     for(int i=0;i<arr.length;i++)
     {
    	 if(arr[i]>lowest)
    	 {
    	 lowest=arr[i];
         }
     }
     
     System.out.println(lowest);
	
	}

}
