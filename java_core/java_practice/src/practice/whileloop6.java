package practice;

import java.util.Scanner;

public class whileloop6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a number");
		int num=sc.nextInt();
		int n=sc.nextInt();
		int sum=1;
		
		
		while(num<=n)
		{
			System.out.println(num);
			sum=sum+num;
			num++;
			
			
		}
		System.out.println(sum);

}
}