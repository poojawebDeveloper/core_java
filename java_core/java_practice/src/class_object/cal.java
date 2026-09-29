package class_object;

import java.util.Scanner;

public class cal {
	
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	public void mul(int x,int y)
	{
		System.out.println(x*y);
	}
	public void div(int x,int y)
	{
		System.out.println(x/y);
	}
	

	public static void main(String[] args) {

		System.out.println("enter first number");
		//System.out.println("enter second number");
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		
		cal c1 =new cal();
		c1.add(x, y);
		c1.sub(x, y);
		c1.mul(x, y);
		c1.div(x, y);
    
	}

}
/*class Cal1
{
	
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	public void mul(int x,int y)
	{
		System.out.println(x+y);
	}
	public void div(int x,int y)
	{
		System.out.println(x/y);
	}
}*/
