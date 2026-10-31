package inheritance;

public class c10 {

	public static void main(String[] args) {

		 String s="java is easy programming";
		 
		 for(int i=0;i<s.length();i++)
		 {
			 for(int j=i+1;j<s.length();j++)
			 {
				 if(s.charAt(i)==s.charAt(j))
				 {
					 System.out.print(s.charAt(i));
					 break;
				 }
			 }
		 }
		 
	}

}
