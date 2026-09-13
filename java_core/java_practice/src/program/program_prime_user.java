package program;

import java.util.Scanner;

public class program_prime_user {

	public static void main(String[] args) {

     Scanner sc = new Scanner (System.in);
     System.out.println("enter a number");
     int n=sc.nextInt();
     int n1=sc.nextInt();
     int counter=0;
 
    	 for(int i=n;i<=n1;i++)
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
    			 counter++;
     }
    	 }
    	 
    	 System.out.println("counter:"+counter);
	}

}
