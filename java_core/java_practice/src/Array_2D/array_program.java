package Array_2D;

import java.util.Scanner;

public class array_program {

	public static void main(String[] args) {
		
	System.out.println("serch element of array is found count");
     int arr[]= {10,20,10,30,10,50,40,30,40,30,40,50,40};
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int count=0;
     for(int i=0;i<arr.length;i++)
     {
    	 if(arr[i]==n)
    	 {
    		 System.out.println(arr[i]);
    		 count++;
    	 }
     }
     System.out.println(count);
	}

}
