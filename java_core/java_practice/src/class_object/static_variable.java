package class_object;

public class static_variable {

	public static void main(String[] args) {
		
		school.name="dps";
		school.pincode=56234;
		
		school s1 =new school();
		s1.name="dypatil";
		System.out.println(s1.name);
		System.out.println(school.name);

		
	}

}
class school
{
	static String name;
	static int pincode;
	
}
