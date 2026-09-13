package program;

public class program_e3_o5_d_ {

	public static void main(String[] args) {

      int num=1;
      while(num<=100)
      {
    	  if(num%2==0)
    	  {
    		  if(num%3==0)
    		  {
    		  System.out.println("even:"+num);
    		  }
    	  }
    	  else
    	  {
    		  if(num%5==0)
    		  {
    		  System.out.println("odd:"+num);
    		  }
    	  }

    	  num++;
      }
	}

}
