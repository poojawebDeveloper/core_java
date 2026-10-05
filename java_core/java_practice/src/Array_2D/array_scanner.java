package Array_2D;

import java.util.Scanner;

public class array_scanner {

	public static void main(String[] args) {
      
	System.out.println("enter your array length");
     Scanner sc=new Scanner (System.in);
     int length=sc.nextInt();
     int arr []=new int[length];
     
     System.out.println("enter array element");
  
     for(int i=0;i<length;i++)
     {
    	arr[i]=sc.nextInt();
    	
     }
        System.out.println("array is=   ");
        for(int i=0;i<length;i++)
        {
        	System.out.print(arr[i]+",");
        }
       
	}

}
