package extra;

public class identity_matrice {

	public static void main(String[] args) {

   int arr[][]= {
		  
		   {1,0,0},
		   {0,1,0},
		   {0,0,1}
   };
   
   boolean one_check=true;
   boolean zero_check=true;
   for(int i=0;i<arr.length;i++)
   {
	   for(int j=0;j<arr.length;j++)
	   {
		   if(i==j)
		   {
			   if(arr[i][j]!=1)
			   {
				   one_check=false;
				   break;
			   }
		   }
		   else
		   {
		   if(arr[i][j]!=0)
		   {
			   zero_check=false;
			   break;
		   }
	   }}
   }
   if(one_check&&zero_check)
   {
	   System.out.println("identity matrics");
   }
   else
   {
	   System.out.println("normal");
   }
	}

}
