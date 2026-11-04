package polymorphism;

public class constructoroverload {

	public static void main(String[] args) {


		student s = new student("abc");//constructor can be overload
	}

}
class student
{
	public student()
	{
		System.out.println("student detatils");
	}
	public student(int x)
	{
		System.out.println("student detatils x");
	}
	public student(String s)
	{
		System.out.println("student detatils s");//output
	}
	public student(int i,String n)
	{
		System.out.println("student detatils  i+n");
	}
}