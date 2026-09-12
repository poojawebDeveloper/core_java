package program;

public class program_prime6 {

	public static void main(String[] args) {
    
		int counter=1;
     for(int i=601;i<=700;i++)
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
    		 System.out.println("prime"+i);
    		 counter++;
    	 }
    	 
     }
     System.out.println("counter:"+counter);
     
     int count=17;
     boolean flag=false;
     for(int i=2;i<count;i++)
     {
    	 if(count%i==0)
    	 {
    		 flag=true;
    		 break;
    	 }
     }
     if(!flag)
     {
    	 System.out.println("counter is prime");
     }
     else
     {
    	 System.out.println("counter is composite");
     }
	}

}
