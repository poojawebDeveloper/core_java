//Find duplicate elements using a method.

package function_base;



public class A8 {

	public static void main(String[] args) {


		dup.dupcheck("programming");
	}

}
class dup
{
	 public static void dupcheck(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++);
			{
				if(s.charAt(i)==s.charAt(j))
				{
					System.out.println(s.charAt(i));
				}
			}
		}
	}
}