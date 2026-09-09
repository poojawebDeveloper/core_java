package program;

public class program_prime1 {

	public static void main(String[] args) {

      int num=98;
      boolean flag=false;
      
      for(int i=2;i<num;i++)
      {
    	  if(num%i==0)
    	  {
    		  flag=true;
    		  break;
    	  }
      }  
    	  if(!flag)
    	  {
    		  System.out.println("prime");
    	  }
    	  else
    	  {
    		  System.out.println("composite");
    	  }
      
	}

}
