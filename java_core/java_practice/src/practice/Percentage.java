package practice;

public class Percentage {

	public static void main(String[] args) {
		int marks=91;
		
		if(marks<35)
		{
			System.out.println("fail");//34
		}
		
		else if(marks<=50)
		{
			System.out.println("Grade C");//35-50
		}
		else if(marks<=70) 
		{
			System.out.println("Grade B");//51-70
		}
		else if(marks<=90) {
			System.out.println("Grade A");//71-90
		}
		else if(marks<=100)//91-100
		{
			System.out.println("Grade A+");
		}
		else 
		{
			System.out.println("fail or invalid");
		}
	}

}
