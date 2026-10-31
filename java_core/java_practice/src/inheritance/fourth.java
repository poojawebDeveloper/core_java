package inheritance;

public class fourth {

	public static void main(String[] args) {

		School sc= new School();
		
		
		
	}

}
class School
{
	public School()
	{
		this(10,20);
		System.out.println("A");
	}
	
	public School(int i)
	{
		System.out.println("B");
	}
	
	public School(int i,int j)
	{
		this(10);
		System.out.println("c");
	}
}