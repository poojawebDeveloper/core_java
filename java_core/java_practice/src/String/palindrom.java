package String;

public class palindrom {

	public static void main(String[] args) {
		
  String s="nayAn";
  
  String s2="";
  
  for(int i=s.length()-1;i>=0;i--)
  {
	  s2=s2+s.charAt(i);
  }
  System.out.println(s2);
  
  if(s.equalsIgnoreCase(s2))
  {
	 System.out.println("polindrom"); 
  }
  else
  {
	  System.out.println("non polindrom");
  }
	}

}
