package program;

import java.util.Scanner;

public class program_scan {

	public static void main(String[] args) {

     Scanner sc =new Scanner (System.in);
     System.out.println("enetr your age");
     int age =sc.nextInt();
     
     if(age>18)
     {
    	 System.out.println("eligible for voting");
     }
     else
     {
    	 System.out.println("not eligible voting");
     }
     }

}
