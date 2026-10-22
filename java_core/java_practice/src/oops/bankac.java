package oops;

public class bankac {

	public static void main(String[] args) {


		bank b = new bank();
		
		b.setbalance(5000);
		b.setdeposite(2000);
		b.setwithdraw(8000);
		System.out.println("balance:"+b.getbalance());
		System.out.println("deposite money:"+b.getdeposite());
		System.out.println("withdaraw money:"+b.getwithdraw());
	}

}
class bank
{
	private int balance;

	int deposite;
	int withdraw;
	
	public void setbalance(int b)
	{
	     this.balance=b;
	}
	public int getbalance()
	{
		return this.balance;
	}
	public void setdeposite(int d)
	{
	     this.deposite=d;
	}
	public int getdeposite()
	{
	     return this.deposite;
	}
	public void setwithdraw(int w)
	{
		if(w<=balance)
		{
	     this.deposite=w;
		}
		else
		{
			System.out.println("not withdraw money");
		}
	}
		public int getwithdraw()
		{
			return balance+deposite-withdraw;
		}
	}
