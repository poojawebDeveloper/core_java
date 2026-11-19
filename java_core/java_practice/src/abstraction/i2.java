package abstraction;

public class i2 {

	public static void main(String[] args) {

		father f=new son();
		mother m=new son();
		f.read();
	    m.read();
	    m.cook();

	}

}
interface father
{
	public abstract void read();
	
}
interface mother
{
	public abstract void read();
	public abstract void cook();
}
class son implements father,mother
{

	@Override
	public void cook() {

		System.out.println("cook method is mother");
	}

	@Override
	public void read() {
		System.out.println("read method is father and mother");
		
	}
	
}