package practice1;

public class practice5 {

	public static void main(String[] args) {

		student s1=new student();
		s1.setname("abc");
		System.out.println(s1.getname());

		
	}

}
class student
{
	private String name;
	
	public void setname(String n)
	{
		this.name=n;
	}
	public String  getname()
	{
		return this.name;
	}
}