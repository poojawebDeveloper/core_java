//
package function_base;

public class A6 {

	public static void main(String[] args) {


		vowel v1 = new vowel();
		v1.count("intresting");
		
	}

}
class vowel
{
	public void count(String x)
	{
		int count=0;
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("count vowels:"+count);
	}
}