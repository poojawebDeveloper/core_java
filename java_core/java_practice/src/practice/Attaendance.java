package practice;

public class Attaendance {

	public static void main(String[] args) {
		int  days=355;
		
		if(days>=1&&days<75)
		{
			System.out.println("20% present");
		}
		else if(days>=75&&days<=100)
		{
			System.out.println("25% present");
		}
		else if(days>=101&&days<=200)
		{
			System.out.println("50% present");
		}
		else if(days>=201&&days<=300)
		{
			System.out.println("75% present");
		}
		else if(days>=301&&days<=366)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("absent");
		}
	}

}
