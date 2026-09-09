package loop;

import java.util.Scanner;

public class prime_program_7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
        int n=sc.nextInt();
        int n1=sc.nextInt();
     for(int i=1;i<=n1;i++)
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
    	 }
     }
	}

}
