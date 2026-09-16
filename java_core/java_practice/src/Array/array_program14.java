package Array;

public class array_program14 {

	public static void main(String[] args) {

		
   int arr[] = {165, 152, 178, 145, 160, 152, 180, 145, 158, 150, 172};
   int lowest=0;
   int slowest=0;
   int tlowest=0;
   int flowest=0;
   for(int i=0;i<arr.length;i++) 
   {
	  if(arr[i]>lowest)
	  {  
		  flowest=tlowest;
		  tlowest=slowest;
		  slowest=lowest;
		  lowest=arr[i];
	  }
	  if(arr[i]!=lowest&&arr[i]>slowest)
	  {
		  tlowest=slowest;
		  slowest=arr[i];
	  }
	  if(arr[i]!=lowest&&arr[i]!=slowest&&arr[i]>tlowest)
	  {
		  flowest=tlowest;
		  tlowest=arr[i];
	  }
	  if(arr[i]!=lowest&&arr[i]!=slowest&&arr[i]!=tlowest&&arr[i]>flowest)
	  {
		  flowest=arr[i];
	  }
   }
   
     System.out.println("first heights:"+lowest);
     System.out.println("second heights:"+slowest);
     System.out.println("third heights:"+tlowest);
     System.out.println("forth heights:"+flowest);


	}

}
