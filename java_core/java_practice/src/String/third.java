package String;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("enter any string");
  String s=sc.next();
  
  
  System.out.println(s.length());
  
  for(int i=s.length()-1;i>=0;i--)
  {
	  System.out.print(s.charAt(i));
  }
	}

}
