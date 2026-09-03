package practice;

import java.util.Scanner;

public class Whileloop8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		while(num%2==0)
		{
			System.out.println("even");
		}
		System.out.println("the end of program");

	}

}
