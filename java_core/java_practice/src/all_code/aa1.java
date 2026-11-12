package all_code;

public class aa1 {

	public static void main(String[] args) {

      String s="java";
      String s1="java";
      
      String s2= new String("java");
      String s3 = new String("java");
      
      System.out.println(s==s1);//true//check memeory address
      System.out.println(s1==s2);//false
      System.out.println(s2==s3);//false
      System.out.println(s.equals(s3));//true//check contains
      System.out.println(s3.intern()==s1);//true // string strore in scp using intern method cannonical copy share heap
		
	}

}
