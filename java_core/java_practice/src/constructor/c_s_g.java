package constructor;

public class c_s_g {

	public static void main(String[] args) {

		
		student_f s = new student_f(1,"abc",89);
		student_f s1 = new student_f();
		s1.setid(2);
		s1.setname("xyz");
		s1.setmarks(89);
		System.out.println(s1.getid());
		System.out.println(s1.getname());
		System.out.println(s1.getmarks());
        s.display();
	}

}
class student_f
{
	int id;
	String name;
	int marks;
	public student_f()
	{
		
	}
	
	public student_f(int i,String n,int a)
	{
		this.id=i;
		this.name=n;
		this.marks=a;
	}
	
	public void setid(int i)
	{
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
	public void setmarks(int a)
	{
		this.marks=a;
	}
	public int getmarks()
	{
		return this.marks;
	}
	void display()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("marks:"+marks);
	}
}