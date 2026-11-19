package abstraction;

public class i3 {

	public static void main(String[] args) {


		I_A  a= new add();
		//int j=a.add(20, 20);
		System.out.println(a.add(20, 20));
		
		I_B b= new add();
		int x=b.add(40,20);
		int y=b.sub(45, 20);
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
interface I_A
{
	
	public abstract int add(int x,int y);
}
interface I_B
{
	public abstract int add(int x,int y);
	public abstract int sub(int x,int y);
}
class add implements I_A,I_B
{

	@Override
	public int sub(int x,int y) {

		return x-y;
	}

	@Override
	public int add(int x,int y) {
		return x+y;
	}
	
}
