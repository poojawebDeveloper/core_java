package practice;

public class whileleapyear {

	public static void main(String[] args) {
		int year=1950;
		int counter=0;
		while(year<=2026)
		{
			if(year%4==0)
			{
				System.out.println(year);
				counter++;
			}
			year++;
		}
		
         System.out.println("count the leap year");
         System.out.println(counter);
	}

}
