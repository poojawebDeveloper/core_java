package practice;

import java.util.Scanner;

public class TableScanner {
     int num;
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("enetr the number");
      int num=sc.nextInt();
     
     int sum=1;
     
     while(sum<=10)
     {
    	 System.out.println(num*sum);
    	 sum++;
     }
     
     
     
	}

}
