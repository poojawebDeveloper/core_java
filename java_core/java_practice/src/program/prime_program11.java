package program;

public class prime_program11 {

	public static void main(String[] args) {
     int sum=0;
     int sum1=0;
     int counter=0;
     int counter2=0;
      for(int i=10;i<30;i++)
      {
    	  boolean flag=false;
    	  for(int j=2;j<i;j++)
    	  {
    		  if(i%j==0)
    		  {
    			  flag=true;
    			  break;
    		  }
    	  }
    	  if(!flag)
    	  {
    		  
    		  //System.out.println("prime:"+i);
    		  sum=sum+i;
    		  counter++;
    	  }
    	  else
    	  {
    		 // System.out.println("composite:"+i);
    		  sum1=sum1+i;
    		  counter2++;
    	  }
      }
      System.out.println("prime number count:"+counter);
      System.out.println("prime number sum:"+sum);
      System.out.println("composite number count:"+counter2);
      System.out.println("composite number sum:"+sum1);
	}

}
