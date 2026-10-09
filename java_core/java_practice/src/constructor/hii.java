package constructor;

public class hii {

	public static void main(String[] args) {

		
		sbi s = new sbi(1,"abc","puen");
		System.out.println(s.Branch);
		s.dis();

	}

}
class sbi
{
	int id;
	String name;
	String Branch;
	
	public sbi(int i,String n,String b)
	{
		this.id=i;
		this.name=n;
		this.Branch=b;
	}
	void dis()
	{
		System.out.println("is:"+id);
		System.out.println("is:"+name);
	}
}
