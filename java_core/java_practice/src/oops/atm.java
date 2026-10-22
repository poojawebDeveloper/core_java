package oops;

public class atm {

	public static void main(String[] args) {

		Atm1 a=new Atm1();
		
		boolean result= a.setbalance(18000, "1224");
		if(result) {
	       a.setwithdraw(2000);
		
	
		System.out.println("balance:"+a.getbalance());
		
		System.out.println("withdraw of amount:"+a.getwithdraw());

		}
	}

}
class Atm1
{
	private int balance;
	
	private int withdraw;
	
	public boolean setbalance(int b,String pin)
	{
		if(pin.equals("1234"))
		{
			this.balance=b;
			System.out.println("correct pin");
			return true;
		}
		else
		{
			System.out.println("invalid pin");
			return false;
		}
		
	}
	public int getbalance()
	{
		return this.balance;
	}
	public void setwithdraw(int w)
	{
		if(balance>10000)
		{
		 this.withdraw=w;
		}
		else
		{
			System.out.println("invalid statement");
		}
		
	}
	public int getwithdraw()
	{
		return balance-withdraw;
	}
}