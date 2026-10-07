package constructor;

public class constructor {

	public static void main(String[] args) {

		filpkart_order flip=new filpkart_order("abc","4556645","411038","pune",500.74);

		System.out.println(flip.name);
		System.out.println(flip.mobile);
		//System.out.println(flip.pincode);
		//System.out.println(flip.city);
		//System.out.println(flip.price);
		
	}

}
class filpkart_order
{
	double price;
	String mobile;
	String pincode;
	String name;
	String city;
	
	public filpkart_order(String n,String m)
	{
		System.out.println("2");
		this.name=n;
		this.mobile=m;
		
	}
	public filpkart_order(String n,String m,String pc)
	{
		this.name=n;
		this.mobile=m;
		this.pincode=pc;
	}
	public filpkart_order(String n,String m,String pc,String ci)
	{
		this.name=n;
		this.mobile=m;
		this.pincode=pc;
		this.city=ci;
	}
	public filpkart_order(String n,String m,String pc,String ci,double pr)
	{
		
		
		this.name=n;
		this.mobile=m;
		this.pincode=pc;
		this.city=ci;
		this.price=pr;
	}

	
}