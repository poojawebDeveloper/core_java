package abstraction;

public class one {

	public static void main(String[] args) {

		upi u1 = new paytm();
		u1.checkbalance();
		u1.dopayment();

		
	}

}
abstract class upi
{
	abstract public void checkbalance();
	abstract public void dopayment();
}
class phonepay extends upi
{

	@Override
	public void checkbalance() {
       System.out.println("phonepay");
	}

	@Override
	public void dopayment() {
		System.out.println("dopayment phonepay");
	}
	
}
class paytm extends upi
{

	@Override
	public void checkbalance() {

		System.out.println("paytm checkbalance");
	}

	@Override
	public void dopayment() {

        System.out.println("dopayment paytm");
	}
	
}