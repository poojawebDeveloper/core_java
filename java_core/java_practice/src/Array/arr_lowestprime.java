package Array;

public class arr_lowestprime {

	public static void main(String[] args) {

     int arr[]= {48,76,94,45,62,89,78,54,76};
     int lowest=0;
     
     for(int i=1;i<arr.length;i++)
     {
     if(arr[i]>lowest)
     {
    	lowest=arr[i]; 
     }
     }
     System.out.println(lowest);
     
     int num=94;
     boolean flag=false;
     
     for(int i=2;i<num;i++)
     {
    	 if(!flag)
    	 {
    		flag=true;
    		break;
    	 }
     }
     if(!flag)
     {
    	 System.out.println("prime");
     }
     else
     {
    	 System.out.println("composite");
     }
     
	}

}
