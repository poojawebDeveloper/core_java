package oops;

public class student {

	public static void main(String[] args) {

		stud s= new stud();
		s.setmarks(32);
		System.out.println(s.getmarks());

	}

}
class stud
{
	private int marks;
	
	public void setmarks(int m)
	{
		this.marks=m;
		if(m>=35&&35<=100)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	public int getmarks()
	{
		return this.marks;
	}
}