package constructor;

public class getset_method {

	public static void main(String[] args) {

		stud1 stud = new stud1();
		stud.setage(12);
	 System.out.println(stud.getage());
		

	}

}
class stud1
{
	int age;
	
	public void setage(int m)
	{
		if(m>18)
		{
			this.age=m;
			System.out.println("voting");
		}
		else
		{
			System.out.println("not voting");
		}
	}
	public int getage()
	{
		return this.age;
	}
	
	}

