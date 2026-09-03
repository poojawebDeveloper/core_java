package practice;

public class ForloopPrime_num {

	public static void main(String[] args) {
       int num=21;
       boolean flag =false;
       for(int i=2;i<=20;i++)
       {
    	   if(num%i==0)
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
