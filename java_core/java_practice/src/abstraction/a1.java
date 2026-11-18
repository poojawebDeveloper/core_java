package abstraction;

public class a1 {

	public static void main(String[] args) {

         bank b1= new sbi();
         b1.display();
         b1.getInterestRate();
         
         bank b2=new hdfc();
         b2.display();
         b2.getInterestRate();
	}

}
abstract class bank
{
	abstract public void getInterestRate();
	
	public void display()
	{
		System.out.println("welcome to bank");
	}
}
class sbi extends bank
{

	@Override
	public void getInterestRate() {
     System.out.println("7% intrest");
		
	}
	
}
class hdfc extends bank
{

	@Override
	public void getInterestRate() {
		System.out.println("9 % interset");
		
	}
	
}