package StringBuilder;

public class insert {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("welcome");
		
		StringBuilder s1=s.insert(7, "java");
		
		System.out.println(s1);
	}

}
