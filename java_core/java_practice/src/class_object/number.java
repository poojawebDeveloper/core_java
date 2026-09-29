package class_object;

   
public class number {
	
	
	public void checkeven(int n)
	{
		if(n%2==0)
		{
			System.out.println("even is:"+n);
		}
		else
		{
			System.out.println("odd is:"+n);
		}
	}
	public boolean iseven(int n)
	{
		if(n%2==0)
		{
    return true;
    }
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {

		number n1=new number();
		n1.checkeven(9);
		boolean num=n1.iseven(9);
		
		System.out.println(num);

	}

}
