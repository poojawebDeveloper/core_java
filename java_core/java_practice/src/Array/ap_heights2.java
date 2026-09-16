package Array;

public class ap_heights2 {

	public static void main(String[] args) {

     int arr[]= {12, 7, 19, 4, 23, 11, 8, 17, 29, 6, 13, 31};
     int lowest=0;
     int slowest=0;
     for(int i=0;i<arr.length;i++)
     {
    	 boolean flag =false;
    	 for(int j=2;j<arr[i];j++)
    	 {
    		 if(arr[i]%j==0)
    		 {
    			 flag=true;
    			 break;
    		 }
    	 }
    	 
     if(!flag)
     {
    	 System.out.println("prime:"+arr[i]);
     }
     if(arr[i]>lowest)
     {
    	 slowest=lowest;
    	 lowest=arr[i];
     }
     if(arr[i]!=lowest&&arr[i]>slowest)
     {
    	 slowest=arr[i];
     }

     }
     System.out.println("prime first hieghts:"+lowest);
     System.out.println("prime second heights:"+slowest);
	}

}
