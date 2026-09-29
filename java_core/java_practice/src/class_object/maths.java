package class_object;

public class maths {

	public static void main(String[] args) {
		
		calculator cal = new calculator();
		
		cal.add(20, 30);
		
		cal.add(70,80);
		
		cal.sub(40, 20);


	}

}

class calculator
{
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	
	
	
}