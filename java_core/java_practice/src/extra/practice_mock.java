package extra;

public class practice_mock {

	public static void main(String[] args) {

    company c1=new company();
    company.compny_name="abc";
    c1.compny_name="xyz";
    c1.employeedetails();
    	
	}

}
class company
{
	static String compny_name;
	public void employeedetails()
	{
		System.out.println("employee deatails"+compny_name);
	}
}
