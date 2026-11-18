package abstraction;

public class a4 {

	public static void main(String[] args) {


		pay p1=new upipayment(5000);
		p1.processPayment();
		p1.showpayment();
		
		
		pay p2=new upipayment(10000);
		p2.processPayment();
		p2.showpayment();
		
		
		
		
	}

}
 abstract class pay
{
	 int amount;
	public pay(int amount)
	{
		this.amount=amount;
		System.out.println("payment constructor called:");
	}
	abstract public void processPayment();
	abstract public void showpayment();
	
}
 class upipayment extends pay
 {
	 public upipayment(int amount)
	 {
		 super(200);
	 }
	 public void processPayment()
	 {
		 System.out.println("processing pyment through upipayment ");
	 }
	 public void showpayment()
	 {
		 System.out.println("payment upi amount"+amount);
	 }
 }
 class card extends pay
 {
	 public card(int amount)
	 {
		 super(200);
	 }
	 public void processPayment()
	 {
		 System.out.println("processing pyment through card ");
	 }
	 public void showpayment()
	 {
		 System.out.println("payment card amount"+amount);
	 }
 }