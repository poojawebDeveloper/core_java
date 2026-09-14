package program;

public class program_prime9 {

	public static void main(String[] args) {

     int num=89;
     
     boolean flag=false;
     for(int i=2;i<89;i++)
     {
    	 if(num%i==0)
    	 {
    		 flag=true;
    		 break;
    	 }
     }
     if(!flag)
     {
    	 System.out.println("prime:"+num);
     }
     else
     {
    	 System.out.println("composite:"+num);
     }
	}

}
