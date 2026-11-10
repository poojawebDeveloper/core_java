//Reverse a String using a method.

package function_base;


public class A7 {

	public static void main(String[] args) {

		reverse r = new reverse();
		r.rev("hello");
		r.revers("java");
		

	}

}
class reverse
{
	public void rev(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}
	public void revers(String x)
	{
		
		StringBuilder s1=new StringBuilder(x);
		
		s1.reverse();
		System.out.println(s1);
				
	}
}