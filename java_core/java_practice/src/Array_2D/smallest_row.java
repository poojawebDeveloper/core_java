package Array_2D;

public class smallest_row {

	public static void main(String[] args) {

  /* int arr[][]={
	   {3, 8, 5},
	   {4, 2 ,6},
	   {7, 9, 1}
			   
	   };*/
   int arr[][]={
		   {0, 0, 0},
		   {0, 0 ,0},
		   {0, 0, 0}
				   
		   };
     boolean zero_check=true;
   
   for(int i=0;i<arr.length;i++)
   {
	   for(int j=0;j<arr.length;j++)
	   {
		   if(arr[i][j]!=0)
		   {
              zero_check=false;
              break;
               
		   }
		   
		   
	   }
   }
   if(zero_check)
   {
	   System.out.println("null matrics");
   }
   else
   {
	   System.out.println("normal matrics");
   }
	}

}
