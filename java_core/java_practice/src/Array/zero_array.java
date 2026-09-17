package Array;

public class zero_array {

	public static void main(String[] args) {

   int arr[]= {10,20,2,23,0,50,0,45,0};
   int counter=0;
   for(int i=0;i<arr.length;i++)
   {
	   
	   if(arr[i]==0)
	   {
		 System.out.println(arr[i]);
		   counter++;
	   }
	   
   }
   System.out.println(counter);
}
}