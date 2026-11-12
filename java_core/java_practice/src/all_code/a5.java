package all_code;

public class a5 {

	public static void main(String[] args) {


		stud s = new stud();
		s.setid(22);
		s.setname("abc");
		System.out.println(s.getid());
		System.out.println(s.getname());
		
	}

}

class stud
{
	int id;
	String name;
	
	public void setid(int i)
	{
		System.out.println("getter and setter method");
		this.id=i;
	}
	public int getid()
	{
		return this.id;
	}
	public void setname(String n)
	{
		this.name=n;
	}
	public String getname()
	{
		return this.name;
	}
}