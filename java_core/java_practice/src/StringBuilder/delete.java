package StringBuilder;

public class delete {

	public static void main(String[] args) {


		StringBuilder s = new StringBuilder("welruncome");
		
		s.delete(3, 6);
		
		System.out.println(s);//start from 0 but ending index is always one extra 
	}

}
