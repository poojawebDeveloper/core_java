package practice1;

public class Q1 {

	public static void main(String[] args) {


		String s="programming";
		
		StringBuilder s1= new StringBuilder(s);
		
		String ch="g";
		
		System.out.println(s1.indexOf(ch));
		System.out.println(s1.lastIndexOf(ch));
	}

}
