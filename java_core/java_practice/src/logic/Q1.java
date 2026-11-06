//check even or odd using function
package logic;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a a1 = new a();
		a1.checkevenodd(11);
		a1.checkevenodd(8);
		
	}

}
class a
{
   public void  checkevenodd(int x)
      {
	   if(x%2==0)
	   {
		   System.out.println("even num"+x);
	   }
	   else
	   {
		   
		   System.out.println("odd num"+x);
	   }
	   }
      }
