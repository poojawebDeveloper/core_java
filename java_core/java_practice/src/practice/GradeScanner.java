package practice;
import java.util.Scanner;
public class GradeScanner {
        int marks;
        
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter a marks");
        int marks=sc.nextInt();
        
        
        if(marks<35)
		{
			System.out.println("fail");//34
		}
		
		else if(marks<=50)
		{
			System.out.println("Grade C");//36-50
		}
		else if(marks<=70) 
		{
			System.out.println("Grade B");//51-70
		}
		else if(marks<=90) {
			System.out.println("Grade A");//71-90
		}
		else if(marks<=100)
		{
			System.out.println("Grade A+");//91
		}
		else 
		{
			System.out.println("fail or invalid");
		}
	}

}
