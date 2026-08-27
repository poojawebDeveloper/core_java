package practice;
import java.util.Scanner;
public class Vote {
     int age;
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("enter your age");
	int age=sc.nextInt();
	

	if(age>18)
	{
		System.out.println("vote");
	}
	else
	{
		System.out.println("non vote");
	}
	

	}

}
