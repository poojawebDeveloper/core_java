package oops;

public class insta {

	public static void main(String[] args) {


		instagram s= new instagram();
		
		s.setpost("kokan", "abc@145");
		
		System.out.println(s.getpost());
		
	}

}
class instagram
{
	private String post;
	
	public void setpost(String p,String pass)
	{
		if(pass.equals("abc@123"))
		{
			this.post=p;
		}
	}
	public String getpost()
	{
		return this.post;
	}
}