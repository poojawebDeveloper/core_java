package all_code;

public class a6 {

	public static void main(String[] args) {

		student12 s= new student12();
		s.setresult("2025","pass");
		System.out.println(s.getresult());

		
	}

}
class student12
{
	private String result;
	
	public void setresult(String prn,String r)
	{
		System.out.println("encapsulation in java");
		if(prn.equals("2025"))
		{
			this.result=r;
		}
	}
	public String getresult()
	{
		return this.result;
	}
}