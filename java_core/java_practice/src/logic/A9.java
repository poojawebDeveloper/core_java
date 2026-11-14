package logic;

public class A9 {

	public static void main(String[] args) {

		person p= new person("abc",24);
		person p1= new person("xyz",17);
		person p2= new person("jkl",20);
		person p3= new person("rqs",18);
		person p4= new person("por",26);
		

        p.display();
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		
		String name="abc";
		System.out.println(name.toUpperCase());

	}

}
class person
{
	  String name;
	 int age;
	
	public person(String n,int a)
	{
		this.name=n;
		this.age=a;
	}


	public void display()
	{
		if(age>=18)
			System.out.println(name.toUpperCase());
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	
	}
	
	
}