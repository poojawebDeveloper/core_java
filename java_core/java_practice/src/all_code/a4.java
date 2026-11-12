package all_code;

public class a4 {

	public static void main(String[] args) {


		student s = new student(22,"abc");
		System.out.println(s.age);
		System.out.println(s.name);
		s.get();
		
	}

}
class student
{
	int age;
	String name;
	public student(int a,String n)//you acess one by one variable first step
	{
		System.out.println("parameterized constructor");
		this.age=a;
		this.name=n;
	}
	public void get()  //you decalare method and acess directly
	{
		System.out.println("age:"+age);
		System.out.println("name:"+name);
	}
}