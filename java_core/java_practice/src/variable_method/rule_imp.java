package variable_method;

public class rule_imp {

	public static void main(String[] args) {

		
		Earth india=new Earth();
		Earth america=new Earth();

		
		india.elections();
		america.elections();
		
	}

}
class Earth
{
	static String sun="bhaskar";
	
	public void elections()
	{
		System.out.println("election process:"+sun);
	}
}