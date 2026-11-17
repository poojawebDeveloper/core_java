//need of dmd 
package polymorphism;

public class dmdneed1 {

	public static void main(String[] args) {


		payment pay = new paytm();
		

		transaction t = new transaction();
		t.history(pay);
	}

}
class payment
{
	public void pay(int amount)
	{
		System.out.println("done payment:"+amount);
	}
}
class googlepay extends payment
{
	public void pay(int amount)
	{
		System.out.println("done googlepay payment:"+amount);
	}
}
class paytm extends payment
{
	public void pay(int amount)
	{
		System.out.println("done paytm payment:"+amount);
	}
}
class transaction
{
	public void history(payment pay)
	{
		pay.pay(250);
	}
}
