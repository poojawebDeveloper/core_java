package Array_2D;

public class even_odd_2d {

	public static void main(String[] args) {

     int arr [][]= {
    		 {89,55,60},
    		 {26,78,39},
    		 {46,89,37}
    		 
     };
     int count1=0;
     int count2=0;
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=0;j<arr[i].length;j++)
    	 {
    		 if(arr[i][j]%2==0)
    		 {
    			// System.out.println("even num:"+arr[i][j]);
    			 count1++;
    		 }
    		 else
    		 {
    			 //System.out.println("odd num:"+arr[i][j]);
    			 count2++;
    		 }
    	 }
     }
     System.out.println("even count:"+count1);
     System.out.println("odd count:"+count2);
    		 
	}

}
