package practice;

public class array_lowest {

	public static void main(String[] args) {
		
   int arr [] = {160, 165, 170, 168, 172, 175, 180, 150};
   
   int lowest=0;
   for(int i=0;i<arr.length;i++)
   {
	   if(arr[i]>lowest)
	   {
		   lowest=arr[i];
	   }
   }

	System.out.println("lowest:"+lowest);			

	}

}
