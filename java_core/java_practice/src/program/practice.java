package program;

public class practice {

	public static void main(String[] args) {
	
   int arr[]= {1,2,1,2,3,3,4,3,4};
   for(int i=0;i<arr.length;i++)
   {
	   int counter=0;
	   int num;
	   num=arr[i];
	   for(int j=0;j<arr.length;j++)
	   {
		   if(arr[j]==num)
		   {
			   counter++;
			  
		   }
		   System.out.println(arr[i]+":"+counter);
	   }
   }

   
}
	
}