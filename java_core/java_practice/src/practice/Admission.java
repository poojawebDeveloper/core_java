package practice;

public class Admission {

	public static void main(String[] args) {
		int present=244;
		int marks=80;
		
		if(present<=50&&marks<=50)
		{
			System.out.println("D Division");
		}
		else if(present<=150&&marks<=65)
		{
			System.out.println("C Division");
		}
		else if(present<=250&&marks<=85)
		{
			System.out.println("B Division");
		}
		else if(present<=366&&marks<=100)
		{
			System.out.println("A Division");
		}
		else 
		{
		System.out.println("absent");
		}
		
			
	}

}
