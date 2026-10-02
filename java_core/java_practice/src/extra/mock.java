package extra;

public class mock {

	public static void main(String[] args) {

       
		/*int arr[][]= {
				{0,3,5},
				{2,0,6},
				{0,5,0}
		};*/
		
		addition add =new addition();
		add.add(50, 20);
		
		int num=add.add(50, 80);
     
		System.out.println(num);
		
		
}
}
class addition
{
	public int add(int x,int y)
	{
		return x+y;
	}
}