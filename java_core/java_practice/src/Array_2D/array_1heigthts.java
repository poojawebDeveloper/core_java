package Array_2D;

public class array_1heigthts {

	public static void main(String[] args) {

      int arr[]= {10,50,89,79,56};
      int arr1[]= {56,89,78,65,74,99};
      int arr3[]= new int[arr.length+arr1.length];
      int lowest=0;
      for(int i=0;i<arr.length;i++)
      { 
    	  arr3[i]=arr[i];
      }
    	 for(int j=0;j<arr1.length;j++)
    	  {
    		 arr3[arr.length+j]=arr1[j];
    		 
    	  }
    	 for(int i=0;i<arr3.length;i++)
    	 {
    		 if(arr3[i]>lowest)
    		 {
    			 lowest=arr3[i];
    		 }
    		 System.out.print(arr3[i]+" ");
    	 }
    	 System.out.println("first and second araay heights:"+lowest);
      }
}
