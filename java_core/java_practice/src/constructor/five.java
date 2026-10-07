package constructor;

public class five {

	public static void main(String[] args) {


		bank b1 = new bank();
		b1.setac_value(10000.00);
		b1.setdeposite(5000.00);
		b1.setwithdraw(2000.00);
		System.out.println("final balance:"+b1.getac_value());
		System.out.println("deposite amount:"+b1.getdeposite());
		System.out.println("withdraw amount:"+b1.getwithdraw());
		System.out.println("final amount:"+b1.getfinel_value());
	}

}
class bank
{
	double ac_value;
	double deposite;
	double withdraw;
	double final_valu;
	
	public void setac_value(double ac)
	{
		this.ac_value=ac;
	}
	public double getac_value()
	{
		return this.ac_value;
	}

	public void setdeposite(double dp)
	{
		this.deposite=dp;
	}
	public double getdeposite()
	{
		return this.deposite;
	}

	public void setwithdraw(double dw)
	{
		this.withdraw=dw;
	}
	public double getwithdraw()
	{
		return this.withdraw;
	}

	
	public double getfinel_value()
	{
		return ac_value+deposite-withdraw;
	}
	
}