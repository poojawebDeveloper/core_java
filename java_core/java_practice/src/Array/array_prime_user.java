package Array;

//import java.util.Scanner;

public class array_prime_user {

	public static void main(String[] args) {

     int arr[]=new int[100];
     
     //Scanner sc = new Scanner (System.in);
     //System.out.println("enter a nummber");
     //int n=sc.nextInt();
    
     for(int i=1;i<arr.length;i++)
     {
    	 boolean flag=true;
    	 for(int j=i;j<i;i++)
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
