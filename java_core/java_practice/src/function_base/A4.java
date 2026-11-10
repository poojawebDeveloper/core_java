package function_base;

public class A4 {

	public static void main(String[] args) {


		palindrom p = new palindrom();
		p.check(121);
		p.check(562);
		
	}

}
class palindrom
{
	public void check(int n)
	{
		int temp=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("palindrom");
		}
		else
			System.out.println("not palindrom");
	}
}