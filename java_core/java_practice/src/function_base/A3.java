//reverse number
package function_base;

public class A3 {

	public static void main(String[] args) {


		d d1 = new d();
		d1.check(12345);
	}

}
class d
{
	public void check(int n)
	{
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println("reverse:"+rev);
	}
}