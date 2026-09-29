package class_object;

public class maths {

	public static void main(String[] args) {
		
		calculator cal = new calculator();
		
		int num=cal.add(20, 30);
		
		int num2=cal.add(70,80);
		
		cal.sub(40, 20);
		
		System.out.println(num);
		System.out.println(num2);



	}

}

class calculator
{
	public int add(int x,int y)
	{
		return x+y;
	}
	public void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	
	
	
}