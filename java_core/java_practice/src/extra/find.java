package extra;

public class find {

	public static void main(String[] args) {

		 int arr[][]= {
		    		{10,20,70},
		    		{40,89,99},
		    		{120,45,78}
		    		
		    };
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr.length;j++)
			 {
				 if(arr[i][j]%2!=0)
				 {
					 System.out.println(i+","+j);
				 }
			 }
		 }
	}

}
