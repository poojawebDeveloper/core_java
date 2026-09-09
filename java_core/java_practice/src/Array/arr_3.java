package Array;

public class arr_3 {

	public static void main(String[] args) {

      int arr []= {45788,47895,96583,78956,256846,478566,245686};
      int highest=2147483647;
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]<highest)
    	  {
    		  highest=arr[i];
    	  }
      }
      System.out.println(highest);
	}

}
