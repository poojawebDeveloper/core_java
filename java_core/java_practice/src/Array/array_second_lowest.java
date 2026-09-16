package Array;

public class array_second_lowest {

	public static void main(String[] args) {

      int arr[]= {52,86,46,78,98,56,47,56,23,21,42,24};
      int hieghts=32768;
      int slowest=32768;
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]<hieghts)
    	  {   
    		  slowest=hieghts;
    		  hieghts=arr[i];
    	  }
    	  if(arr[i]!=hieghts&&arr[i]<slowest)
    	  {
    		  slowest=arr[i];
    	  }
      }
      System.out.println("first lowest:"+hieghts);
      System.out.println("second lowest:"+slowest);

	}

}
