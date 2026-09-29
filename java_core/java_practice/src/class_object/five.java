package class_object;

public class five {

	public static void main(String[] args) {

		
		liabrary l1 = new liabrary();
		l1.b_name="secrate";
		l1.b_author="xyz";
		l1.b_available="yes";

	}

}
class liabrary
{
	
	String b_name;
	String b_author;
	String b_available;
	
	public void displaybook()
	{
		System.out.println("book");
	}
	public void borrowbook()
	{
		
	}
	public int returnbook()
	{
		return 2;
	}
}
