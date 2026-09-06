package program;

public class prime_num {
	
  public static void main(String[] args) {
     
	  int num=47;
	  boolean flag=false;
	  
	  for(int i=2;i<=46;i++)
	  {
		  if(i%num==0)
		  {
			  flag=true;
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
