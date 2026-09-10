package Array;

public class array_sum_evenodd {

	public static void main(String[] args) {

      int arr []= {4,8,7,9,6,2,3};
      int sum=0;
      //int sum1=0;
      
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]%2==0)
    	  {
    		  System.out.println(arr[i]);
    		  sum=sum+arr[i];
    		  
    	  }
    	  /*else
    	  {
    		  System.out.println(arr[i]);
    		  sum1=sum1+arr[i];
    	  }*/
      }
      System.out.println(sum);
      //System.out.println(sum1);
	}

}
