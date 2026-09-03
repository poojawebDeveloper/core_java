package loop;

public class Forloop_year {

	public static void main(String[] args) {
		
		int year;
	

		for(year=1950;year<=2026;year++)
		{
			if(year%4==0)
			{
				System.out.println("leap year" + year);
			}
			else
			{
				System.out.println("normal year" + year);
	
			}
			
		}
		
		
		
	}

}
