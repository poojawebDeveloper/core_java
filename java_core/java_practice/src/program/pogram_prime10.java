package program;

public class pogram_prime10 {

	public static void main(String[] args) {
      int counter=0;
      int sum=0;
     for(int i=701;i<=800;i++)
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
    		 System.out.println("prime:"+i);
    		 sum=sum+i;
    		 counter++;
    	 }
     }
     System.out.println("sum of prime:"+sum);
     System.out.println("counnter:"+counter);
	}

}
