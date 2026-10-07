package constructor;

public class set_getmethod {

	public static void main(String[] args) {
      
		number first = new number();
		
		first.setnum(8);
		System.out.println(first.getnum());
	}

}
class number
{
	int num;
	
   public void setnum(int n)
   {
	   if(num%2==0)
	   {
		   this.num=n;
		   System.out.println("even");
	   }
	   else
	   {
		   System.out.println("odd");
	   }
   }
	   public int getnum()
	   {
		   return this.num;
	   }
   }
	

