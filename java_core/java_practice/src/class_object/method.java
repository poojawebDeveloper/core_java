package class_object;

public class method {

	public static void main(String[] args) {

		Car c1=new Car();
		c1.start();
		
		int num=c1.trip();
		
		System.out.println(num);
		
		student s1=new student();
		s1.display();
		s1.get();
		

	}

}
class Car
{
	public void start()
	{
		System.out.println("the car is starting");
	}
	public int trip()
	{
		return 100;
	}
}
class student
{
	public void get()
	{
		System.out.println("student");
	}
	public void display()
	{
		System.out.println("student display");
	}
}
