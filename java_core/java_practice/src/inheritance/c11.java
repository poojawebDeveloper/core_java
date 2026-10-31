package inheritance;

public class c11 {

	public static void main(String[] args) {

		branch b1 = new branch();
		b1.acsess();

	}

}
class bnk
{
	String name1;
	
	public bnk()
	{
		this("raj");
		System.out.println("hii");
	}
	public bnk( String name)
	{
		this.name1=name;
		System.out.println("wel come to sbi"+this.name1);
	}
	
	
}
class branch extends bnk
{
	public branch()
	{
		super();
		System.out.println(" branch");
		
	}
	public void acsess()
	{
		System.out.println(super.name1);
	}
}