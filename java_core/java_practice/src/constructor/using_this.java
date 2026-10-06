package constructor;

public class using_this {

	public static void main(String[] args) {

    stude stud = new stude(26,"abc");
    
   // System.out.println(stud.age);
   // System.out.println(stud.name);
      stud.get();
    
		
	}

}
class stude
{
	
	int age;
	String name;
	
	public stude(int a,String n)
	{
		age=a;
		name=n;
	}
	void get()
	{
		System.out.println(age+":"+name);
	}
	
}
