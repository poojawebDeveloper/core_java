package program;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     System.out.println("enetr your number");
     int n=sc.nextInt();
     
     if(n%2==0)
     {
    	 System.out.println("even:"+n);
     }
     else
     {
    	 System.out.println("odd:"+n);
     }
     System.out.println("square:"+n*n);
     System.out.println("cube:"+n*n*n);
     
     boolean flag=false;
     
     for(int i=2;i<n;i++)
     {
    	 if(n%i==0)
    	 {
    		flag=true;
    		break;
    	 }
     }
     if(!flag)
     {
    	 System.out.println("prime:"+n);
     }
     else
     {
    	 System.out.println("composite:"+n);
     }
     
	}

}
