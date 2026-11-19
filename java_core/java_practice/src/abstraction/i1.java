package abstraction;

public class i1 {

	public static void main(String[] args) {

		I_Ani a= new lion();
		a.eat();
		a.run();
		

	}

}
interface  I_Ani
{
public abstract	void run();
public abstract	void eat();

}
class lion implements  I_Ani
{

	@Override
	public void run() {
		System.out.println("animal run");
		
	}

	@Override
	public void eat() {
		System.out.println("animal eat");
		
	}
	
}