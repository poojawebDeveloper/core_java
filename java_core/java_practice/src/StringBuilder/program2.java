package StringBuilder;

public class program2 {

	public static void main(String[] args) {


		String s = "java is very easy";
        StringBuilder s1 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                s1.append(s.charAt(i));
            }
        }

        System.out.println(s1);
	}

}
