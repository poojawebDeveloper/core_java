package Array;

public class array_program3 {

	public static void main(String[] args) {

      int numbers[]= {12455,8994,3557,478775,57788,64789,322554,7555};
      int lowest=0;
      for(int i=0;i<numbers.length;i++)
      {
    	  if(numbers[i]>lowest)
    	  {
    	 lowest=numbers[i]; 
    	  }
      }
      System.out.println(lowest);
	}

}