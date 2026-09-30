package variable_method;

public class method {

	public static void main(String[] args) {

		System.out.println("this is leap year");
		
		year y1 = new year();
		boolean year=y1.ischeck(2024);
		System.out.println(year);
		y1.isleapyear(2024);
		
		
	}

}

class year
{
	public boolean ischeck(int n)
	{
		if(n%4==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void isleapyear(int n)
	{
		if(n%4==0)
		{
			System.out.println("is leapyear:"+n);
		}
		else
		{
			System.out.println("normal year:"+n);
		}
	}
}
