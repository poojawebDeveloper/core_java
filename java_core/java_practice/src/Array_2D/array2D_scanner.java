package Array_2D;

import java.util.Scanner;

public class array2D_scanner {

	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("enter array element length");
      int row=sc.nextInt();
      int col=sc.nextInt();
      int arr[][]=new int [row][col];
      System.out.println("array is");
      for(int i=0;i<arr.length;i++)
      {
    	  for(int j=0;j<arr[i].length;j++) {
    	  
    	  arr[i][j]=sc.nextInt();
      }
      }
     
      
      for(int i=0;i<arr.length;i++)
      {
    	  for(int j=0;j<arr[i].length;j++) {
    	  
    	 System.out.print(arr[i][j]+" ");
      }
    	  System.out.println();
      }
     
    
      }
	}


